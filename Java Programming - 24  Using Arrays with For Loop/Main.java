import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arg[] = new int[3];
        for (int i = 0; i < arg.length; i++) {
            System.out.println("I's value " + i + " Please enter your num: ");
            arg[i] = scanner.nextInt();
            System.out.println("I's value " + i + " " + arg[i]);
        }

        scanner.close();

    }

}
