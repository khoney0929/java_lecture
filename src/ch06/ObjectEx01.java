package ch06;

class Dog extends Object{
    String name = "토토";
}

class Cat{
    String name = "야옹이";
}




public class ObjectEx01 {
    public static void main(String[] args) {
        Object o1 = new Dog();
        Object o2 = new Cat();

        // 다운캐스팅하여 Object-> Dog or Cat으로 변환
        Dog cl1 = (Dog)o1;
        Cat cl2 = (Cat)o2;

        System.out.println(cl1.name);
        System.out.println(cl2.name);
    }
}
