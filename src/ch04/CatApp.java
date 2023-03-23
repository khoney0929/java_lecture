package ch04;

import ch04.a.Cal;

public class CatApp {
    public static void main(String[] args) {
        Cat c1 = new Cat("냥냥이","하얀색");
        System.out.println(c1.name);
        System.out.println(c1.color);


        Cat c2 = new Cat("꾹꾹이","검은색");
        System.out.println(c2.name);
        System.out.println(c2.color);

        Cat c3 = new Cat();
        System.out.println(c3.name);
        System.out.println(c3.color);


    }
}
