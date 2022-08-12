public class Main {
    public static void main(String[] args) {
        //Задание №1
        int[] arrInt = new int [3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        for (int i = 0; i < arrInt.length; i++){
            System.out.print(arrInt[i] + " ");
        }
        System.out.println();
        double[] arrDouble = {1.57, 7.654, 9.986};
        for (int i = 0; i < arrDouble.length; i++){
            System.out.print(arrDouble[i] + " ");
        }
        System.out.println();
        boolean[] arrBoolean = {true, false, false};
        for (int i = 0; i < arrBoolean.length; i++){
            System.out.print(arrBoolean[i] + " ");
        }

        //Задание №2
        System.out.println("\n");
        for (int i = 0; i < arrInt.length; i++){
            System.out.print(arrInt[i]);
            if (i != arrInt.length - 1)
                System.out.print(", ");
            else
                System.out.println();
        }
        for (int i = 0; i < arrInt.length; i++){
            System.out.print(arrDouble[i]);
            if (i != arrInt.length - 1)
                System.out.print(", ");
            else
                System.out.println();
        }
        for (int i = 0; i < arrInt.length; i++){
            System.out.print(arrBoolean[i]);
            if (i != arrInt.length - 1)
                System.out.print(", ");
            else
                System.out.println();
        }
    }
}