package desc;

import java.util.Random;

public class Produtor extends Thread {
    
    private Buffer buffer;
    private Random randomNumber;

    public Produtor(Buffer buffer) {
        this.buffer = buffer;
        randomNumber = new Random();
    }

    public void run() {
        while(true) {
            try {
                Thread.sleep(600);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            int number = randomNumber.nextInt(100);
            buffer.add(number);
        }
    }

}
