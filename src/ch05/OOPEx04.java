package ch05;

class 임꺽정{

    void 달리기(){
        System.out.println("달리기1");
    }

    // 오버로딩
    void 달리기(int speed){
        System.out.println("인트가 들어간 달리기");
    }
    void 달리기(double speed){
        System.out.println("더블이 들어간 달리기");
    }
    void 달리기(int speed, double power){
        System.out.println("인트와 더블이 들어간 달리기");
    }

}

public class OOPEx04 {
    public static void main(String[] args) {
        임꺽정 e = new 임꺽정();
        e.달리기();
        e.달리기(1);
        e.달리기(5.0);
        e.달리기(1,5.0);
    }
}
