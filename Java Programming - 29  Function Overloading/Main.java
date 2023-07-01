public class Main {
    public static void main(String[] args) {
        functionOverloading overloadingObj = new functionOverloading();
        overloadingObj.printRun();
        overloadingObj.printRun(9);
    }

}

class functionOverloading {
    public void printRun() {
        System.out.println("Batman scored 1 run");
    }

    public int printRun(int run) {
        System.out.println("Batman scored " + run + " run");
        return 0;
    }
}