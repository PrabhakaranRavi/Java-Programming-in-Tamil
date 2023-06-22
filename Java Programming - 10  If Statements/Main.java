import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = scanner.nextInt();
        if(num == 4){
            System.out.println("Number is equal to 4");
        }else if(num > 4){
            System.out.println("Number is greater than 4");
        }else{
            System.out.println("Number is less than 4");
        }
        scanner.close();
    }
}
