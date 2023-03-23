package ch06;

public class ArrayForEx01 {

    static void 남은금액계산(int[] coin, int change) {

        for (int i = 0; i < coin.length; i++) {
            System.out.println(coin[i] + "원짜리 갯수 : " + change / coin[i] + "개");
            change = change % coin[i];
            System.out.println("남은 금액 : " + change);
        }
    }


    public static void main(String[] args) {

        int[] coin = {500, 100, 50, 10};
        int money = 4390;
        int change = money;
        남은금액계산(coin,change);
    }
}
