public class BooleanTest {

    public static void main(String[] args) {

        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;

        flag1 = 10 > 5;
        flag2 = 10 < 5;
        flag3 = 10 >= 5;
        flag4 = 10 <= 5;
        flag5 = 10 == 5;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);
        System.out.println(flag5);


        System.out.println("--------------------------");

        boolean flag6 = false;
        boolean flag7 = false;
        boolean flag8 = false;
        boolean flag9 = false;
        boolean flag10 = false;
        boolean flag11 = false;

        flag6 = 10 > 5 && 5 < 20;
        flag7 = 10 > 5 & 5 < 20;
        flag8 = 10 >= 10 || 5 > 6;
        flag9 = 10 >= 10 | 5 > 6;
        flag10 = 10 == 10 ^ 5 > 6;
        flag11 = !flag10;

        System.out.println(flag6);
        System.out.println(flag7);
        System.out.println(flag8);
        System.out.println(flag9);
        System.out.println(flag10);
        System.out.println(flag11);


    }
}
