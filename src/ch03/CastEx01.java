package ch03;

public class CastEx01 {
    public static void main(String[] args) {
        // 캐스팅 (다운캐스팅, 업캐스팅)
        int n1 = 100; // 4Byte
        double d1 = n1; // 8Byte ( 8Byte <- 4Byte)
        System.out.println(d1); // 업캐스팅(묵시적)

        double d2 = 100.8; // 명시적 형변환 (int) 다운캐스팅
        int n2 = (int)d2;  // double을 int로 변환 할 수 없어서 다운캐스팅을 사용 (단점 : 데이터 유실)
        System.out.println(n2); // 데이터 유실

    }
}
