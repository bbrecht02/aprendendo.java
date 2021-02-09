import java.util.Scanner;

public class Tea {
    public static void main(String[] args)
    {
        int tea; 
        int count = 0;
        int[] usrGuess = new int[5];

        Scanner scTea = new Scanner(System.in);
        tea = scTea.nextInt();

        for (int i = 0; i < 5; i++) {
            Scanner scGuess = new Scanner(System.in);
            usrGuess[i] = scGuess.nextInt();
        }

        scTea.close();

        for (int i = 0; i < 5; i++) {
            if (usrGuess[i] == tea) {
                count++;
            }
        }

        System.out.println(count);

    }
}