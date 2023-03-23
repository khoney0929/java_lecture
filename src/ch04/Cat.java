package ch04;

public class Cat {
    String name;
    String color;

    // 매우매우매우 중요!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // Cat() 생성자를 디폴트 생성자라고 한다.
    // 클래스 생성시 기본적으로 숨겨져있지만 강제로 만들면 응용가능
    // 직접 생성자를 구현하면 디폴트 생성자를 생략할 수 없다.
    public Cat(){
        System.out.println("디폴트생성자로 고양이탄생");


    }

    // 생성자(메서드) - 생성자를 직접 구현 / 직접구현하면 디폴트 생성자가 생기지 않음
    public Cat(String n, String c){
        System.out.println("고양이 탄생함");
        System.out.println("n : " + n);
        System.out.println("c : " + c);


        // String n, String c 는 지역변수 = Cat() 이라는 생성자(메서드)가 가진 지역변수
        name = n;
        color = c;

    }
}
