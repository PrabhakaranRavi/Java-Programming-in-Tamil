public class Main {
    public static void main(String[] args) {
        DOBOfUser dobObj = new DOBOfUser(20, 5, 1996);
        nameOfUser nameObj = new nameOfUser("Prabhkaran", dobObj);
        nameObj.printNameAndDOB();
    }
}

class nameOfUser {
    String name;
    DOBOfUser dob;

    public nameOfUser(String name, DOBOfUser dob) {
        this.name = name;
        this.dob = dob;
    }

    public void printNameAndDOB() {
        System.out.println("Name is " + name);
        dob.printDOBOfuser();
    }
}

class DOBOfUser {
    int date;
    int month;
    int year;

    public DOBOfUser(int x, int y, int z) {
        date = x;
        month = y;
        year = z;
    }

    public void printDOBOfuser() {
        System.out.println("DOB: " + date + "/" + month + "/" + year);
    }
}