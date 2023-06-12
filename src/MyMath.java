public class MyMath {

    // 자동생성 - 기본 생성자는 생성자가 없을 경우 컴파일할 때 자동으로 생성된다
    private MyMath() {
        // 기본 생성자
        // 리턴타입x
        // private로 변경하면, 해당 클래스 안에서만 접근할 수 있게 된다
    }


    public static int abs(int x) {
        if (x < 0) {
            return x * -1;
        } else {
            return x;
        }
    }


}
