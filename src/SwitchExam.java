public class SwitchExam {

    public static void main(String[] args) {

        int num = 1;
        switch (num) {
            case 1 :
                System.out.println("1입니다.");
                break;
            case 2 :
                System.out.println("2입니다.");
                break;
            case 3 :
                System.out.println("3입니다.");
                break;
            default:
                System.out.println("1, 2, 3이 아닙니다.");
        }

        char ch = 'a';
        switch (ch) {
            case 'a':
            case 'A':
                System.out.println("A입니다.");
                break;
            case 'b':
            case 'B':
                System.out.println("B입니다.");
                break;
            case 'c':
            case 'C':
                System.out.println("C입니다.");
                break;
            default:
                System.out.println("A, B, C가 아닙니다.");
        }

        String str = "감자";
        switch (str) {
            case "감자":
                System.out.println("감자입니다.");
                break;
            case "고구마":
                System.out.println("고구마입니다.");
                break;
            default:
                System.out.println("감자와 고구마가 아닙니다.");
        }

    }

}
