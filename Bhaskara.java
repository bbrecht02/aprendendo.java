import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Bhaskara {

    public static void main(String[] args) {

        //Bhaskara formula
        double a,b,c, delta, root1, root2;

        Scanner aSc = new Scanner(System.in);
        a = aSc.nextDouble();
        Scanner bSc = new Scanner(System.in);
        b = bSc.nextDouble();
        Scanner cSc = new Scanner(System.in);
        c = cSc.nextDouble();

        aSc.close();
        bSc.close();
        cSc.close();

        delta = (Math.pow(b, 2) - (4*a*c));

        root1 = (-b + Math.sqrt(delta))/ (2.0 * a);
        root2 = (-b - Math.sqrt(delta))/ (2.0 * a);

        NumberFormat formatter = new DecimalFormat("0.00000");

        if (delta > 0 || a != 0) {
            System.out.println("R1 = " + formatter.format(root1));
            System.out.println("R2 = " + formatter.format(root2));
        }
        else {
            System.out.println("impossivel calcular");
        }

    }
}
