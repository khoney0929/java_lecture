package ch05;

// 행위의 제약을 줘서 다른 메서드를 못쓰게 막음
interface MoveAble{
    // public abstract 가 기본으로 생략
    void 위();
    void 아래();
    void 왼쪽();
    void 오른쪽();
    void 냄새맡기();
}
interface MoveAble2{
    void 위();
    void 아래();
    void 왼쪽();
    void 오른쪽();
    void 숨기();
}


abstract class 사나운동물 implements MoveAble {
    abstract void 공격(); // 미완성된 메서드 자식클래스의 공격방식이 다르므로 자식클래스에서 완성해야함

    @Override
    public void 아래() {
        System.out.println("아래로 이동");
    }
    @Override
    public void 위() {
        System.out.println("위로 이동");
    }
    @Override
    public void 왼쪽() {
        System.out.println("왼쪽으로 이동");
    }
    @Override
    public void 오른쪽() {
        System.out.println("오른쪽으로 이동");
    }
    @Override
    public void 냄새맡기() {
        System.out.println("코로 냄새 맡기");
    }
}

abstract class 온순한동물 implements MoveAble2 {
    abstract void 채집();

    @Override
    public void 위() {
        System.out.println("위로 이동");
    }

    @Override
    public void 아래() {
        System.out.println("아래로 이동");
    }

    @Override
    public void 왼쪽() {
        System.out.println("왼쪽으로 이동");
    }

    @Override
    public void 오른쪽() {
        System.out.println("오른쪽으로 이동");
    }

    @Override
    public void 숨기() {
        System.out.println("숨기");
    }
}


// 구현이 자식 클래스로 위임(위,아래,왼쪽,오른쪽)
class 원숭이 extends 온순한동물 {

    @Override
    void 채집() {
        System.out.println("바나나 채집");
    }
}

class 소 extends 온순한동물 {

    @Override
    void 채집() {
        System.out.println("풀 채집");
    }
}
class 말 extends 온순한동물{
    @Override
    void 채집() {
        System.out.println("풀 먹기");
    }
}

class 호랑이 extends 사나운동물 {

    @Override
    void 공격() {
        System.out.println("이빨로 공격");
    }
}

class 코뿔소 extends 사나운동물 {

    @Override
    void 공격() {
        System.out.println("박치기로 공격");
    }
}

public class OOPEx09 {

    static void 매크로(온순한동물 u1){
        u1.채집();
        u1.숨기();
        u1.아래();
        u1.오른쪽();
        u1.위();
        System.out.println("==================");
    }
    static void 매크로(사나운동물 u1){
        u1.아래();
        u1.오른쪽();
        u1.위();
        u1.공격();
        u1.냄새맡기();
        System.out.println("==================");
    }


    public static void main(String[] args) {
        소 u1 = new 소();
        매크로(u1);
        원숭이 u2 = new 원숭이();
        매크로(u2);
        호랑이 u3 = new 호랑이();
        매크로(u3);
        코뿔소 u4 = new 코뿔소();
        매크로(u4);
        말 u5 = new 말();
        매크로(u5);


    }
}
