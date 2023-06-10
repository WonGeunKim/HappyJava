public class VeedingMachineMain {

    // VendingMachine 클래스가 있어야만 main 메소드는 컴파일되고 실행될 수 있다
    // => 의존한다고 표현

    public static void main(String[] args) {

        // 인스턴스 안해도 실행 가능
        VendingMachine.printVersion();


        VendingMachine vm1 = new VendingMachine();   // 인스턴스를 생성
        VendingMachine vm2 = new VendingMachine();
        // 메모리 상에 인스턴스가 2개 생성된 것

        vm1.printVersion(); // static한 메소드는 레퍼런스변수명.static메소드() .. 좋지않은 방식

        String product = vm1.pushProductButton(100);
        System.out.println(product);


    }
}
