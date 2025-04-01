package Day2;

import java.util.Scanner;

public class MultiplyFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two floating-point numbers
        System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();
        
        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();
        
        // Calculate the product
        float product = num1 * num2;
        
        // Display the result
        System.out.println("Product: " + product);
        
        scanner.close();
    }
}