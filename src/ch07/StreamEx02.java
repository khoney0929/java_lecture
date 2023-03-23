package ch07;

import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        InputStream in = System.in; // System.in 키보드
        InputStreamReader ir = new InputStreamReader(in); // 65를 A로 부호화

        try {
            char[] data = new char[1];
            ir.read();
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
