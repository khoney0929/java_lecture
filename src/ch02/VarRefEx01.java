package ch02;


// new가 되어서 힙에 할달이 될 때 사이즈를 알 수 있다.(프로그램이 실행 됐을 때 = Runtime)
class MyData{
    int id = 1;
    int price = 1000;
}

//래퍼런스 (참조) 변수, 일반 변수
public class VarRefEx01 {
    public static void main(String[] args) {
        // 타입 변수; int num; 변수를 선언한다.
        // 타입 변수 = 값; int num = 10; 변수를 초기화(메모리에 할당) 한다.

        int num = 10; // 일반 변수(크기가 정해져 있는 것 = 컴파일 시점)
        MyData d = new MyData();     // 래퍼런스 변수(크기가 정해져 있지 않은 것 = 컴파일 시점)

        System.out.println(num);
        System.out.println(d.id);
        System.out.println(d.price);
    }
}
