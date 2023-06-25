class addTwoNumber{
    public int addTwo(int num1,int num2){
        int result = num1 + num2;
        System.out.println("Addition of two numbers: " + result);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
       addTwoNumber addTwoObj = new addTwoNumber();
        addTwoObj.addTwo(02, 4);
    }
}
