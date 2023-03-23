package ch06;

import java.util.ArrayList;

public class CollectionEx01 {
    public static void main(String[] args) {
        // 기본 자료형은 값을 가지고 있음 제네릭사용 불가
        // String, 커스텀자료형(클래스) => 래퍼런스자료형(주소) 제네릭 가능
        // 래핑클래스(기본 자료형을 감싸고있어서 클래스자료형처럼 변환해서 사용가능) = Integer, Double, Character, Boolean
        ArrayList<Integer> c1 =new ArrayList<Integer>();

        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(5);

//        System.out.println(c1.get(0));

        // 반복되는 size() 메서드 호출을 막기위해 변수에 값 삽입
        int size = c1.size();
        // for문 (반복문)
        for (int i = 0; i < size; i++) {
            System.out.println(c1.get(i));
        }
    }
}
