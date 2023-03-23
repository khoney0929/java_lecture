package ch06;

public class ForEx02 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            if (i == 6) {
                continue;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("=====================");

        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("=====================");
    }
}
