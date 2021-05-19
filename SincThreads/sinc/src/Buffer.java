package sinc;

import java.util.concurrent.Semaphore;

public class Buffer {

    private static final Buffer instance = new Buffer();
    private static final int arraySize = 5;
    private static final int InicialFreePosition = 0;

    private int[] buffer;
    private int freePosition;

    private Semaphore bufferFull;
    private Semaphore bufferEmpty;

    
    private Buffer() { 
        buffer = new int[arraySize];
        freePosition = InicialFreePosition;

        bufferEmpty = new Semaphore(arraySize-1);
        bufferFull = new Semaphore(arraySize);
    }

    public static Buffer getInstance() {
        return instance;
    }

    public void add(int receivedInput) {

        try {

            bufferEmpty.acquire();

            if (freePosition >= arraySize) {
                System.out.println("error at production");
            }
            else {
                buffer[freePosition] = receivedInput;

                System.out.println("Producer: " +
                                Thread.currentThread().getId() + 
                                "inserted number: " + receivedInput +
                                " at position: " + freePosition);
                
                freePosition++;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        bufferFull.release();

    }

    public void remove() {

       try {

            bufferFull.acquire();

            if (freePosition <= InicialFreePosition) {
                System.out.println("error at consumer");
            }
            else {
                freePosition--;

                System.out.println("Consumer " +
						Thread.currentThread().getId() +
						" removed number: " + buffer[freePosition] +
						" at position: " + freePosition);
            }

            bufferEmpty.release();
       } catch (Exception ex) {
           ex.printStackTrace();
       }
    }
}