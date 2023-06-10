public class VendingMachine {

    // field (가지는 것들)
    // 생성자
    // method

    public String pushProductButton(int menuId) {
        System.out.println(menuId + "를 전달받았습니다.");
        return "콜라";
    }

    // 이렇게 작성된 메소드는 인스턴스를 생성하지 않아도 사용할 수 있다
    public static void printVersion() {
        System.out.println("v1.0");
    }

}
