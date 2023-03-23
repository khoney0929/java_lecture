package ch03;

public class GasMileageExample {
    public static void main(String[] args) {
        /*
        문제
        가솔린 8.86L를 충전한 A자동차는 총 182.736Km를 운행할 수 있다. 이 차의 연비를 계산하라
         */

        double fuel = 8.86;
        double distance = 182.736;

        double gasMileage = (int)(distance/fuel);

        System.out.println("이 차의 연비는 : "+ gasMileage + "Km/L 입니다.");

    }
}
