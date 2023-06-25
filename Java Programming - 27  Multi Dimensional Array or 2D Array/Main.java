public class Main {
    public static void main(String[] args) {
        // int a[] = { 1, 2, 3, 4, 5 };
        int b[][] = { { 1, 2, 3, }, { 4, 5, 6 } };
        // 1 2 3
        // 4 5 6
        // System.out.println(b[0][2]);

        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[row].length; col++) {
                System.out.print(b[row][col] + "\t");
            }
            System.out.println();
        }
    }

}
