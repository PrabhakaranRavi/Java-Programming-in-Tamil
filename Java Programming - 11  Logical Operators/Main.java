import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Please give true/false for if you are eligible or not ? ");
        boolean voteRegistered = scanner.nextBoolean();

        if( age >= 18 && voteRegistered){
            System.out.println("You can vote.");
        }else{
            System.out.println("You are not eligible to vote.");
        }
        scanner.close();
    }
    
}
