package ch07;


class SubThread implements Runnable {
    // 자바의 서브 스레드
    public void run(){
        for(int i = 1; i<6; i++){
            try {
                System.out.println("서브스레드 : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

public class ThreadEx01 {

    // 자바의 메인 스레드
    public static void main(String[] args) {

        SubThread st = new SubThread();
        Thread t1 = new Thread(st); // 타겟 설정
        t1.start(); // run 메서드 실행

        for(int i = 1; i<6; i++){
            try {
                System.out.println("메인스레드 : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
