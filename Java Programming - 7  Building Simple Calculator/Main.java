import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double firstNum = scanner.nextDouble();

        System.out.println("Enter your second number: ");
        double secondNum = scanner.nextDouble();

        double addition = firstNum + secondNum;
        System.out.println("Addition: " + addition);
        scanner.close();
    }
}