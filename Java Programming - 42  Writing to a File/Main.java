import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fileWrite = new FileWriter(
                    "D://Java-Programming-in-Tamil//Java Programming - 42  Writing to a File//test.txt");
            fileWrite.write("CS IN TAMIL");
            fileWrite.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
