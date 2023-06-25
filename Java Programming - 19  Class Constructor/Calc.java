public class Calc {
    public static void main(String[] args) {
        MultiCalu calcObj = new MultiCalu(10, 9);
        calcObj.getValueForMulti(10, 1);

    }
}

class MultiCalu {
    private double firstNum;
    private double secondNum;
    private double finalProduct;

    public MultiCalu(double num1, double num2) {
        firstNum = num1;
        secondNum = num2;
        System.out.println("Initially when constructor started the values: " + firstNum + " " + secondNum);
    }

    public double getValueForMulti(double num1, double num2) {
        this.firstNum += num1;
        this.secondNum += num2;
        System.out.println("After we added the values: " + firstNum + " " + secondNum);
        this.finalProduct = firstNum * secondNum;
        System.out.println("Final result: " + finalProduct);
        return finalProduct;
    }
}