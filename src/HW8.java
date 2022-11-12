public class HW8 {
    public static void main(String[] args) {

        System.out.println("Домашнее задание. Массивы часть 1");
        System.out.println("Задание 2.1");
        int [] arrayOne = new int[3];
        arrayOne [0] =1;
        arrayOne [1] =2;
        arrayOne [2] =3;
       for (int m1 = 0; m1 < arrayOne.length; m1++) {
           if (m1 != arrayOne.length - 1) {
           System.out.print(arrayOne[m1] + ", ");
       } else { System.out.print(arrayOne[m1] );
           }
       }
       System.out.println();
       System.out.println("Задание 2.2");
        double [] arrayTwo = {1.57, 7.654, 9.986};
        for (int m2 = 0; m2 < arrayTwo.length; m2++) {
            if (m2 != arrayTwo.length - 1) {
                System.out.print(arrayTwo[m2] + ", ");
            } else { System.out.print(arrayTwo[m2] );
            }
        }
        System.out.println();
        System.out.println("Задание 2.3");
        int [] arrayThree = new int [17];
        int b = 2;
        for ( int a = 0; a < arrayThree.length; a++) {
            b = b +3;
            arrayThree[a] = b;
        }
        for (int m3 = 0; m3 < arrayThree.length; m3++) {
            if (m3 != arrayThree.length - 1) {
                System.out.print(arrayThree[m3] + ", ");
            } else { System.out.print(arrayThree[m3] );
            }
        }
        System.out.println();
        System.out.println("Задание 3.1");
        int m1 = arrayOne.length;
        while ( m1> 0 ) {
            m1--;
            if (m1 > 0) {
                System.out.print(arrayOne[m1] + ", ");
            } else {
                System.out.print(arrayOne[m1]);
            }
        }
        System.out.println();
        System.out.println("Задание 3.2");
        int m2 = arrayTwo.length;
        while (m2 > 0) {
            m2--;
            if (m2 > 0) {
                System.out.print(arrayTwo[m2] + ", ");
            } else {
                System.out.print(arrayTwo[m2]);
            }
        }
        System.out.println();
        System.out.println("Задание 3.3");
        int m3 = arrayThree.length;
        while (m3 > 0) {
            m3--;
            if (m3 > 0) {
                System.out.print(arrayThree[m3] + ", ");
            } else {
                System.out.print(arrayThree[m3]);
            }
        }
        System.out.println();
        System.out.println("Задание 4");

        for ( int d = 0; d < arrayOne.length; d++) {

            if (arrayOne[d] % 2 != 0) {
                arrayOne[d]++;
                System.out.println(arrayOne[d]);
                } else {
                System.out.println(arrayOne[d]);
            }
        }
    }
}



