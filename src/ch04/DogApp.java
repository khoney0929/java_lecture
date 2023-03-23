package ch04;

public class DogApp {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.color);
        System.out.println(d1.type);

        // 1년 뒤 강아지의 상태 변경

        d1.age = d1.age + 1;
        d1.color = "갈색";
        d1.name = "초코";
        //d1.type = "푸들";

        System.out.println("==================");
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.color);
        System.out.println(d1.type);

    }

}
