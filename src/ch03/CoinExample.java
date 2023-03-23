package ch03;

public class CoinExample {

    public static void main(String[] args) {
        // 최소 동전구하기 600 / 150 / 10
        int money = 4390;
        int change = money;

        int count600 = 0;
        int count150 = 0;
        int count10 = 0;

        System.out.println("보유한 금액 : " + money+ "원");

        count600 = money/600;
        System.out.println("600원짜리 갯수 : " + count600 + "개");
        change = change%600;
        System.out.println("남은 금액 : " + change + System.lineSeparator());

        count150 = change/150;
        System.out.println("150원짜리 갯수 : " + count150 + "개");
        change = change%150;
        System.out.println("남은 금액: " + change + System.lineSeparator());

        count10 = change/10;
        System.out.println("10원짜리 갯수 : " + count10 + "개");
        change = change%10;
        System.out.println("남은 금액: " + change);

        System.out.println("==========================");
        System.out.println("600원짜리 갯수 : " + count600 + "개");
        System.out.println("150원짜리 갯수 : " + count150 + "개");
        System.out.println("10원짜리 갯수 : " + count10 + "개");
        System.out.println("==========================");
    }
}
