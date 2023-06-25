public class Shop {
    public static void main(String[] args) {
        ShopCashFlow shopObj = new ShopCashFlow();
        shopObj.addMoney(10);
         shopObj.addMoney(20);
          shopObj.addMoney(25);

          System.out.println("Total money at end of the date: " + shopObj.getMoney());
    }
}

class ShopCashFlow{
    // public int money;
    private int money;

    public void addMoney(int money){
        this.money += money;
    }

    public int getMoney(){
        return money;
    }
}