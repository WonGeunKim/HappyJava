public class VeedingMachineMain {

    // VendingMachine 클래스가 있어야만 main 메소드는 컴파일되고 실행될 수 있다
    // => 의존한다고 표현

    public static void main(String[] args) {

        // 인스턴스 안해도 실행 가능
        VendingMachine.printVersion();


        VendingMachine vm1 = new VendingMachine();   // 인스턴스를 생성
        VendingMachine vm2 = new VendingMachine();
        // 메모리 상에 인스턴스가 2개 생성된 것

//        vm1.printVersion(); // static한 메소드는 레퍼런스변수명.static메소드() .. 좋지않은 방식

        String product = vm1.pushProductButton(100);
        System.out.println(product);

        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);

    }
}

// javac Hello.java
// Hello.java Hello.class
// java Hello
// 틀린답 : 현재 폴더에서 찾는다
// 정답 : JVM은 CLASSPATH 경로에서 Hello 클래스를 찾아서 실행한다   // CLASSPATH=. 이라고 잡혀있다고 생각

// javac vendingMachine.java
// javac vendingMachineMain.java

// java vendingMachineMain - 터미널에선 이렇게 실행
// 자바로 vendingMachineMain을 실행했을 때 , vendingMachineMain을 어디서 찾아서 실행할까?
// JVM은 CLASSPATH 경로에서 찾음
// JVM은 PERM 메모리에 올라가 있는 VendingMachineMain 클래스에서 main 메소드를 찾음

// vendingMachine.printVersion();
// JVM은 위 코드를 만나면 printVersion() 메소드는 static 메소드이기 때문에 실행 가능하다고 판단하고 실행해주게 된다
// printVersion() 메소드가 실행되면 Java Stack에 스택 엔트리가 하나 더 추가된다