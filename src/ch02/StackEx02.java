package ch02;

/*
정리 : Stack(지역변수) - 메서드가 실행될 때 메모리에 할당됨 = 메서드가 종료될 때 사라짐 생명주기가 가장 짧음
    : Heap(전역변수) - new 할때 메모리에 할당됨 = 더이상 참조하지 않을 때 메모리에서 사라짐
    : Static(전역변수) - main메서드가 실행되기전에 할당됨 = main 메서드가 종료 될 때 사라짐 가장 길음
 */

public class StackEx02 {

    static int sum = 20;
    void a(){
        int n1 = 1;  // a 메서드의 스텍영역에 저장(지역변수)


    }

    public static void main(String[] args) {
       StackEx02 s = new StackEx02();
        System.out.println(sum);

    }
}
