public class LabelExam {

    public static void main(String[] args) {

        outter:
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if(i == 0 && k == 2)
//                    break outter;   // break만 써 있으면 가장 인접한 for 반복문을 빠져나감
                    // break outter; 라고 되어 있으면 outter가 붙은 for반복문을 빠져나가게 된다

                    continue outter;

                System.out.println(i + ", " + k);
            }
        }
        // i == 0 이고 k == 2 일때 break outter를 실행하게 되고 이중 반복문을 종료하고 프로그램을 종료
        // i == 0 이고 k == 2 일때 continue outter를 실행하게 되면 그 아래 줄은 실행하지 않고 바깥쪽 for문을 반복
    }

}
