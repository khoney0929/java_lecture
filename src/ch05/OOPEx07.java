package ch05;

abstract class Animal{
    abstract void speak(); // 추상 메서드 {} 몸체가 없다. 쓸일이 없으니까
}

class Dog extends Animal{
    // 오버라이드(Animal의 speak()가 무효화된다)
    void speak(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    // 오버라이드(Animal의 speak()가 무효화된다)
    void speak(){
        System.out.println("야옹");
    }
}

class Bird extends Animal{
    // 추상메서드를 부모가 가지고 있으면 자식은 추상메서드를 무조건 구현해야 한다.
    void speak() {
        System.out.println("짹짹");
    }
}



public class OOPEx07 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();

        a1.speak(); // 동적바인딩 된다. 부모의 메서드가 무효화 되고 자식메서드 호출
        a2.speak(); // 동적바인딩 된다. 부모의 메서드가 무효화 되고 자식메서드 호출
        a3.speak();

//        Animal a3 = new Animal();

    }


}
