package ch04.a;

public class Cal {
    void add(){ // default 접근제어자 - 동일한 패키지에서만 접근 가능
        System.out.println("더하기 메서드");
    }

    public void minus(){ // public 접근제어자 - 다른 패키지에서도 접근 가능

        System.out.println("빼기 메서드");
    }

    private void multi(){ // private 접근제어자 - 동일한 클래스에서만 접근 가능
        System.out.println("곱하기 메서드");
    }
}
