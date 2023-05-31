public class Gugudan {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            System.out.println("1 * " + i + " = " + (1 * i));
        }

        System.out.println();

        // 중첩 반복문
        for (int k = 1; k <= 9; k++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(k + " * " + i + " = " + (k * i));
            }
            System.out.println();
        }

    }

}