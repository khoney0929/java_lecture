package ch04;

public class People {
    String name;
    int age;


    // 디폴트생성자가 아닌 직접 만들었기때문에 디폴트생성자가 안쓰임
    public People(String name, int age) {
        System.out.println("People 메서드 스택 name : " + name);
        System.out.println("People 메서드 스택 age : " + age);

        this.name = name;
        this.age = age;
    }

}
