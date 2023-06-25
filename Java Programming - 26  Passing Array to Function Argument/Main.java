public class Main {
    public static void main(String[] args) {
        int x[] = { 1, 2, 3, 4, 5 };
        printArray(x);
    }

    public static void printArray(int x[]) {
        for (int y : x) {
            System.out.println(y);
        }
    }
}
