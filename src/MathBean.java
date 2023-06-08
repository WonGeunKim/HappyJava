public class MathBean {

    // 매개변수x , 리턴x
    public void printClassName() {
        System.out.println("MathBean");
    }

    // 매개변수o , 리턴x
    // 매개변수 타입, 개수가 중요
    public void printNumber(int number) {
        System.out.println(number);
    }

    // 매개변수x , 리턴o
    public int getOne() {
        return 1;
    }

    // 매개변수o, 리턴o
    public int plus(int x, int y) {
        return x + y;
    }

}
