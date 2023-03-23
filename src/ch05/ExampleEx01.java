package ch05;

interface RemoconAble{
    public void 초록버튼();
    public void 빨간버튼();
}

class Samsung implements RemoconAble{
    @Override
    public void 빨간버튼() {
        System.out.println("전원 끄기");
    }

    @Override
    public void 초록버튼() {
        System.out.println("전원 켜기");
    }
}

class LG implements RemoconAble{
    @Override
    public void 빨간버튼() {
        System.out.println("전원 끄기");
    }

    @Override
    public void 초록버튼() {
        System.out.println("전원 켜기");
    }
}

public class ExampleEx01 {
    public static void main(String[] args) {
        Samsung s1 = new Samsung();
        Samsung s2 = new Samsung();

        LG l1 = new LG();
        LG l2 = new LG();
    }
}
