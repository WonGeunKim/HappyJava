public class NumberExam {

    public static void main(String[] args) {

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;

        System.out.println(maxInt);
        System.out.println(minInt);

        System.out.println(maxDouble);
        System.out.println(minDouble);


        // 오버플로우
        System.out.println(maxInt + 1);


        double d1 = 50;
        double d2 = 500L;

        System.out.println(d1);
        System.out.println(d2);


//        int i1 = 50.0;
//        int i2 = 25.6f;
        int i1 = (int)50.0;
        int i2 = (int)25.6f;    // 잘림현상

        System.out.println(i1);
        System.out.println(i2);
    }
}
