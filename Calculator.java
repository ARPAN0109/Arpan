import java.util.*;
public class Calculator {
    static Scanner scan;
    public static void main(String [] args){
        scan = new Scanner(System.in);
        float num1, num2;
        float add, subtract, multiply, divide;
        int choice;


        System.out.print("-> Enter 1st number: ");
        num1 = scan.nextFloat();

        System.out.print("-> Enter 2nd number: ");
        num2 = scan.nextFloat();

        System.out.println("\t\t---------------");
        System.out.println("\t\t|1. Add       |"+"\n"+"\t\t|2. Subtract  |"+"\n"+"\t\t|3. Multiply  |"+"\n"+"\t\t|4. Divide    |");
        System.out.println("\t\t---------------");
        System.out.print("-> Enter your choice: ");
        choice = scan.nextInt();


            switch (choice) {
                case 1:
                    add = num1 + num2;
                    System.out.println("-> The addition of " + num1 + " & " + num2 + " is " + add);
                    break;
                case 2:
                    subtract = num1 - num2;
                    System.out.println("-> The subtraction of " + num1 + " & " + num2 + " is " + subtract);
                    break;
                case 3:
                    multiply = num1 * num2;
                    System.out.println("-> The multiplication of " + num1 + " & " + num2 + " is " + multiply);
                    break;
                case 4:
                    divide = num1 / num2;
                    System.out.println("-> The division of " + num1 + " & " + num2 + " is " + divide);
                    break;
                default:
                    System.out.println("--INVALID INPUT--");
            }


    }
}
