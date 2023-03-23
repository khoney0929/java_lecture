package ch01;

class Boong{
    int price = 1000;
    String taste = "달콤함";
    String color = "노란색";

}

public class Example01 {
    public static void main(String[] args) {
        Boong bbang1 = new Boong();

        System.out.println(bbang1.price);
        System.out.println(bbang1.taste);
        System.out.println(bbang1.color);
    }
}
