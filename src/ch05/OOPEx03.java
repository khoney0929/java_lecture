package ch05;

// 그냥 요리사
class 요리사{
    String name = "요리사";
}


// 홍길동 or 요리사 임
class 홍길동 extends 요리사 {
    String name = "홍길동";
}


// 다형성
public class OOPEx03 {
    public static void main(String[] args) {
        홍길동 h1 = new ch05.홍길동(); // 홍길동,요리사 heap 공간에 같이 있음
        System.out.println(h1.name);

        요리사 y1 = new 홍길동();
        System.out.println(y1.name);
    }
}
