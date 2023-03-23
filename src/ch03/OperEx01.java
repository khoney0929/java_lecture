package ch03;

public class OperEx01 {
    public static void main(String[] args) {
        // 삼항연산자 = 조건연산자
        int n1 = 5;

        // 조건(비교연산자) ? true : false
        System.out.println(n1==5 ? "5가 맞습니다." : "5가 아닙니다.");

        int point = 59;
        String result = point >= 60 ? "합격했습니다" : "재수강해야합니다.";

        System.out.println("결과 : " + result);


    }
}
