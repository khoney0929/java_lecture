package ch04;

public class FoodExample {
    String name;
    int price;

    public FoodExample(String name, int price){
        this.name = name;
        this.price = price;
    }

    void myPrint(){
        System.out.println(name + " 가격은 " + price + "입니다.");
    }


    public static void main(String[] args) {
        FoodExample f1 = new FoodExample("치킨", 2000);
        f1.myPrint();

        FoodExample f2 = new FoodExample("피자", 5000);
        f2.myPrint();

    }
}
