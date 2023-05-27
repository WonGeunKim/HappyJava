public class IfExam {

    public static void main(String[] args) {

        int a = 5;
        if(a > 4){
            System.out.println("a는 4보다 큽니다.");
        }

        int b = 3;
        if(b > 4) {
            System.out.println("b는 4보다 큽니다.");
        }else {
            System.out.println("b는 4이하입니다.");
        }

        int score = 70;
        if(score >= 90){
            System.out.println("A");
        }else if (score >= 80){
            System.out.println("B");
        }else if (score >= 70){
            System.out.println("C");
        }else if (score >= 60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        System.out.println("프로그램 종료");

        int c = 10;
        if (c > 5)
            System.out.println("a는 10보다 큽니다.");
            System.out.println("hello");
        // 블록{} 이 없으면 if문 아래 한줄만 true일 때 실행 .. hello는 if문과 상관없이 실행

        int d = 10;
        int value = (d > 5) ? 20 : 30;
        System.out.println(value);

    }
}
