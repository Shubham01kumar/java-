import java.util.Scanner;

public class Frist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Display welcome message
        System.out.println("Welcome " + name + " to Skill Development Training");

        
    }
}