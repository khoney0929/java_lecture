package ch02;


class 손님{
    void 커피마시기(){
        System.out.println("커피마시기");
    }
}

public class MethodEx01 {

    //메서드 = MethodEx01 클래스의 행위
    void start(){
        System.out.println("만나서 반갑습니다.");
        System.out.println("스타트메서드 종료");
    }

    public static void main(String[] args) {
        MethodEx01 methodex01 = new MethodEx01();
        methodex01.start();

        손님 손 = new 손님();
        손.커피마시기();
    }
}
