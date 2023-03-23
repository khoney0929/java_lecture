package ch05.srpdip;

interface CanAble{
    public abstract void talk();
}

abstract class 홀직원 implements CanAble{
    abstract void 청소();
    public void talk(){
        System.out.println("손님과 대화");
    };
}

abstract class 종업원 extends 홀직원{
    void 서빙하기(){
        System.out.println("서빙하기");
    }
    void 주문받기(){
        System.out.println("주문받기");
    }
}

abstract class 캐셔 extends 홀직원{
    void 정산하기(){
        System.out.println("정산하기");
    }
    void 계산하기(){
        System.out.println("현금 계산하기");
    }
}

abstract class 가수{
    abstract void 노래하기();
}

class 철수 extends 종업원{

    가수 j; // 의존성 역전 원칙

    @Override
    void 청소() {
        System.out.println("화장실 청소");
    }
}

class 영희 extends 종업원{

    가수 j; // 의존성 역전 원칙

    @Override
    void 청소() {
        System.out.println("주방 청소");
    }
}
class 민수 extends 캐셔{

    @Override
    void 청소() {
        System.out.println("홀 청소");
    }
}
class 도준 extends 캐셔{

    @Override
    void 청소() {
        System.out.println("테이블 청소");
    }
}
class 아이유 extends 가수{

    @Override
    void 노래하기() {
        System.out.println("발라드 부르기");
    }
}
class 수지 extends 가수{

    @Override
    void 노래하기() {
        System.out.println("팝송 부르기");
    }
}


public class OOPEx10 {
    public static void main(String[] args) {
        아이유 u1 = new 아이유();
        u1.노래하기();

    }
}
