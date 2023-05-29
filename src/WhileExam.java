public class WhileExam {

    public static void main(String[] args) {

        int i = 1;
/*        while (i <= 5) {
            System.out.println(i);
            i++;
        }*/

/*        while (true) {
            if (i == 11) {
                break;
            }
            System.out.println(i);
            i++;
        }*/

        // i 값이 10과 비교를 먼저 - 조건이 참이면 반복 - 블록안을 실행할 때 ++되어서 출력 = i가 1이기 때문에 추가되서 2부터 출력
/*        while (i++ < 10) {  // i는 1
            System.out.println(i);  // i는 2
        }*/

        while (i++ < 10) {
            if (i % 2 != 0) {
                continue;   // continue를 만나면 밑에 줄 실행하지 않고 반복문으로 돌아감
            }
            System.out.println(i);
        }

    }

}
