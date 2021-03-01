/*
Conditional Statements exercisee 2
 */
package conditionalstatements2;

import java.util.Scanner;

public class QuadraticEquations {

    public static void main(String[] args) {
        //Solve quadratic equations
        System.out.println("Solves quadratic equations");
        Scanner input = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = input.nextDouble();
        System.out.println("Input b: ");
        double b = input.nextDouble();
        System.out.println("Input c: ");
        double c = input.nextDouble();
        double result = b * b - 4.0 * a * c;
        if(result > 0.0){
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2 + "\n");
        }else{
            System.out.println("The equation has no roots. \n");
        }
    }
}
