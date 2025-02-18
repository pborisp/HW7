public class Main {
    public static void main(String[] args) {
        //Задача №1
        int[] mas1 = new int[] {1, 2, 3};
        double[] mas2 = {1.57, 7.654, 9.986};
        int[] mas3 = {1, 2, 3, 4, 5};

        // Задача №2
        System.out.println("Задача №2:");
        for (int i = 0; i < mas1.length; i++) {
            if (i == mas1.length - 1) {
                System.out.print(mas1[i]);
                break;
            }
            System.out.print(mas1[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < mas2.length; i++) {
            if (i == mas2.length - 1) {
                System.out.print(mas2[i]);
                break;
            }
            System.out.print(mas2[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < mas3.length; i++) {
            if (i == mas3.length - 1) {
                System.out.print(mas3[i]);
                break;
            }
            System.out.print(mas3[i] + ", ");
        }
        System.out.println();
    }
}