public class Full_Pyramid {
    public static void main(String[] args) {

        int row = 5;

        for (int i = 1; i <= row; i++) {

            /*When i = 1, it prints row - 1 spaces
            When i = 2, it prints row - 2 spaces, and so on.*/
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i+"");
            }

            System.out.println();
        }
    }
}
