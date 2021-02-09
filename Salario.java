public class Salario {
    public static void main(String[] args) {

        /*
        Crie uma variavel salario e imprima seu imposto
        imposto:
        salario < 1000 5%
        salario >= 1000 && salario < 2000 10%
        salario >= 2000 && salario < 4000 15%
        salario > 5000 20%
         */

        double salary = 2000;
        double tax = 0; 

        if (salary <= 1000) {
            tax = salary * 0.05;
        }
        else if (salary >= 1000 && salary < 2000) {
            tax = salary * 0.1;
        }
        else if (salary >= 2000 && salary < 4000) {
            tax = salary * 0.15;
        }
        else {
            tax = salary * 0.2;
        }

        System.out.println("tax: "+tax);
        
    } 
}