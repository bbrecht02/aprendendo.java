import java.util.Scanner;

public class DiaUtil {

    public static void main(String[] args) {

        
        Scanner daySc = new Scanner(System.in);
        
        byte day = daySc.nextByte();

        switch(day) {

            case 1:
                System.out.println("weekend");
                break;
            case 2:
                System.out.println("week");
                break;
            case 3:
                System.out.println("week");
                break;

            case 4:
                System.out.println("week");
                break;

            case 5:
                System.out.println("week");
                break;

            case 6:
                System.out.println("week");
                break;

            case 7:
                System.out.println("weekend");
                break;

            default: 
                System.out.println("invalid option");
                break;

        }
    }
}