import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomObj = new Random();
        for (int i = 0; i <= 6; i++) {
            System.out.println(randomObj.nextInt(6) + 1);
        }
    }
}
