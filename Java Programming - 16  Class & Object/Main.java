class add{
    public int addTwo(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        add addObj = new add();
        int result = addObj.addTwo(3,3);
        System.out.println(result);
    }
}


//https://www.youtube.com/watch?v=3yOLNV9BF8A - Watched this video for reference.