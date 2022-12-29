/*


public class Main {
    public static void main(String[] args) {
        */
/* 객체 생성 *//*

        Square s = new Square();
        */
/* 필드 초기화(값 변경) *//*

        s.length = 5;
        */
/* 결과 출력 *//*

        System.out.println("한 변의 길이가"+s.length+"인 정사각형의 넓이 :"+ s.area());
    }
}

*/
/* 정사각형 클래스 구현 *//*

 class Square{
    int length;
    //넓이계산메소드
    public int area(){

        return length*length;
    }

}*/
/*
public class Main {
    public static void main(String[] args) {
        */
/* 1. TOP 3 고로케를 객체로 만드세요. *//*

        Goroke g1 = new Goroke("피자",1000);
        Goroke g2 = new Goroke("야채",800);
        Goroke g3 = new Goroke("팥",500);
        */
/* 2. 고로케 정보를 출력하세요. *//*

        System.out.println(g1.str());
        System.out.println(g2.str());
        System.out.println(g3.str());

    }
}
class Goroke {
    // 필드
    String name;
    int price;

    // 생성자
    Goroke(String n, int p) {
        name = n;
        price = p;
    }

    // 메소드
    String str() {
        return String.format("Goroke { name: %s, price: %d원 }", name, price);
    }
}*/

/*
public class Main {
    public static void main(String[] args) {
        // 객체 생성
        Hero ironMan = new Hero("아이언맨", 80);
        Hero thanos = new Hero("타노스", 160);
        Hero thor = new Hero("토르", 150);
        Hero groot = new Hero("그루트", 40);

        // 모든 객체 정보를 출력
        System.out.println(ironMan.toStr());
        System.out.println(thanos.toStr());
        System.out.println(thor.toStr());
        System.out.println(groot.toStr());
    }
}

// Hero 클래스
class Hero {
    // 필드
    String name;
    int hp;

    // 생성자
    Hero(String n, int h) {

        */
/* 2. 필드 값을 초기화하세요. *//*

        name = n;
        hp = h;
    }
    // 메소드
    String toStr() {
        return String.format("Hero { name: %s, hp: %d }", name, hp);
    }
}*/
/*public class Main {
    public static void main(String[] args) {
        // 디폴트 생성자로 객체 만들기
        Drink d1 = new Drink();
        d1.name = "포카리";
        d1.price = 1000;

        // 다른 생성자로 객체 만들기
        Drink d2 = new Drink();
        d2.name = "박카스";
        d2.price = 800;

        // 모든 객체 출력
        System.out.println(d1.toStr());
        System.out.println(d2.toStr());
    }
}

// 드링크 객체
class Drink {
    // 필드
    String name;
    int price;

    *//* 1. 디폴트 생성자를 추가하세요. *//*

    // 생성자
    Drink() {
        String name;
        int price;
    }

    // 메소드
    String toStr() {
        return String.format("Drink { name: %s, price: %d }", name, price);
    }
}*/

/*

public class Main {
    public static void main(String[] args) {
        // 객체 생성
        Song s0 = new Song("별헤는 밤", "유재하");
        Song s1 = new Song("비상", "임재범");
        Song s2 = new Song("비밀", "박완규");

        // 객체 배열 생성
        Song[] songs = { s0,s1,s2 };

        // 모든 배열 속 객체 출력
        for (int i = 0; i < songs.length; i++) {
            */
/* 2. 객체 정보를 출력하세요. *//*

            System.out.println(songs[i].toStr());
        }
    }
}

class Song {
    // 필드
    String name;
    String singer;

    // 생성자
    Song(String n, String s) {
        name = n;
        singer = s;
    }

    // 메소드
    String toStr() {
        return String.format("Song { name: %s, singer: %s }", name, singer);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        // 객체 생성
        Hero thor = new Hero("토르", 150);     // thor -> {"토르", 150}
        Hero thanos = new Hero("타노스", 160); // thanos -> {"타노스", 160}

        // 토르의 펀치 -> 타노스
        thor.punch(thanos);
        thanos.punch(thor);
        *//* 2.코드를 추가하여 펀치를 주고 받으세요. *//*
        thor.punch(thanos);
        thanos.punch(thor);
    }
}

class Hero {
    // 필드
    String name;
    int hp;

    // 생성자
    Hero(String s, int i) {
        name = s;
        hp = i;
    }

    // 메소드
    void punch(Hero enemy) {
        // 때린 주체 객체
        System.out.printf("[%s]의 펀치!! ", name);


        *//* 1. 맞은 객체에 대한 정보를 출력하세요. *//*
        System.out.printf("%s의 HP : %d -> ",enemy.name, enemy.hp);
        enemy.hp-=10;
        System.out.printf("%d",enemy.hp);
        System.out.println();
    }
}*/
public class Main {
    public static void main (String[] args) {
        // 객체 생성
        Char marine = new Char("레이너",80,0);
        Char medic = new Char("모랄레스",60,60);
        // 마린의 스팀팩!
        marine.stimpack();
        // 메딕의 힐!
        medic.heal(marine);
    }
}
class Char{
    String name;
    int hp;
    int mp;

    Char(String n, int h, int m){
        name = n;
        hp = h;
        mp = m;
    }
    public void heal(Char marine){
        System.out.printf("[%s]의 치유! -> ",name);
        System.out.printf("[%s]HP : %d -> ",marine.name,marine.hp);
        marine.hp += 10;
        System.out.printf("%d",marine.hp);



        }
    void stimpack(){
        System.out.printf("[%s]의 스팀팩! HP : %d",name,hp);
        hp -=10;
        System.out.printf("-> %d\n",hp);
    }
}
