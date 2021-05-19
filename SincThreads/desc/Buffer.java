package desc;

public class Buffer {

    private static final Buffer instance = new Buffer();
    private static final int arraySize = 5;
    private static final int InicialFreePosition = 0;

    private int[] buffer;
    private int freePosition;

    private Buffer() { 
        buffer = new int[arraySize];
        freePosition = InicialFreePosition;
    }

    public static Buffer getInstance() {
        return instance;
    }

    public void add(int receivedInput) {

        if (freePosition >= arraySize) {
            System.out.println("erro ao produzir");
        }

        else {
            buffer[freePosition] = receivedInput;

            System.out.println("Producer: " + 
                    Thread.currentThread().getId() + 
                    " inserted number: " + receivedInput + 
                    " at position: " + freePosition);
            
            freePosition++;
        }
    }

    public void remove() {

        if (freePosition <= InicialFreePosition) {
            System.out.println("erro ao remover");
        }
        else {
            freePosition--;

            System.out.println("Consumer: " + 
                    Thread.currentThread().getId() + 
                    "removed number: " + buffer[freePosition] + 
                    " at position: " + freePosition);
        }
    }

}