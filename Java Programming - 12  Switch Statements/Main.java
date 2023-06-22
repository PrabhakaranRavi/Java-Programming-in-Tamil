import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = scanner.nextInt();

        // if( num == 1){
        //     System.out.println("One");
        // }else if (num == 2){
        //     System.out.println("Two");
        // }else{
        //     System.out.println("Other Numbers !!!");
        // }

        switch (num){
            case 1:
            System.out.println("One");
            break;
            case 2:
            System.out.println("Two");
            break;
            default:
            System.out.println("Other Numbers !!!");
            break;
        }
        scanner.close();
    }
    
}
