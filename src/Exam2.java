public class Exam2 {
    public static void main(String[] args) {
        // 높이 : 3

        int num = 3;
        int count = num ;

        for(int i = num; i > 0; i--){ //세로
            for (int j = 1; j <= count; j++){ //
                if (j >= i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            count = count + 1;
        }
        /*

           *
          ***
         *****

         */
        System.out.println();

///////////////////////////////////////////////////////////////


        // 높이 : 5
        int num5 = 5;
        int count5 = num5 ;

        for(int i = num5; i > 0; i--){ //세로
            for (int j = 1; j <= count5; j++){ //
                if (j >= i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            count5 = count5 + 1;
        }

        // 출력

        /*

             *
            ***
           *****
          *******
         *********

         */

        System.out.println();

///////////////////////////////////////////////////////////////

        // 높이 : 7

        int num7 = 7;
        int count7 = num7 ;

        for(int i = num7; i > 0; i--){ //세로
            for (int j = 1; j <= count7; j++){ //
                if (j >= i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            count7 = count7 + 1;
        }


        // 출력

        /*

               *
              ***
             *****
            *******
           *********
          ***********
         *************

         */

    }
}
