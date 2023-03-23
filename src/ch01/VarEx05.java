package ch01;


class Note{
    int price;
    String name;

}

public class VarEx05 {
    public static void main(String[] args) {
        Note note1 = new Note(); //heap 공간에 Note 클래스가 가지고있는 모든 데이터를 할당해 ( 대신 static은 제외 )
        Note note2 = new Note();
        Note note3 = new Note();

        note1.price = 1000;
        note1.name = "가";

        note2.price = 2000;
        note2.name = "나";

        note3.price = 3000;
        note3.name = "다";


        System.out.println(note1.price);
        System.out.println(note1.name);
        System.out.println("--------------");
        System.out.println(note2.price);
        System.out.println(note2.name);
        System.out.println("--------------");
        System.out.println(note3.price);
        System.out.println(note3.name);


    }
}
