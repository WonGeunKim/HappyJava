public class PersonTest2 {

    public static void main(String[] args) {

        // 인스턴스를 만들기 전에 JVM이 하는 일이 있음
        // - JVM은 Person 클래스가 CLASSPATH에 있는지 찾아보고 클래스를 찾을 수 없으면 ClassNotFoundException 오류가 발생
        Person p1 = new Person();
        Person p2 = new Person();

        // Person p1 = new Person(); 실행되려면 Person 클래스가 필요
        // JVM은 CLASSPATH에서 Person 클래스를 찾고 Person 클래스 정보를 메모리에 올림
        // Person 클래스 정보를 읽어 들일 때 static한 필드는 정적 영역에 따로 저장됨
        // Person이 가지고 있는 count 변수는 별도로 저장되고 0으로 초기화됨
        // count 변수는 인스턴스 별로 가지는 것이 아니라 정적 영역에 따로 관리됨
        // => p1.count , p2.count는 같은 메모리의 값을 출력하게 됨
        // 인스턴스를 만들지 않아도 Person을 JVM이 읽어 들일 때 count변수는 메모리에 따로 올라감

        System.out.println(Person.count);   // 이렇게 하는 것이 좋음

        p1.name = "홍길동";
        p2.name = "조조";

        System.out.println(p1.name);
        System.out.println(p2.name);

        System.out.println(p1.count);
        System.out.println(p2.count);
        p1.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);   // p1을 증가시켰는데도 p2도 증가됨

        p2.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);

        System.out.println(Person.count);

    }

}
