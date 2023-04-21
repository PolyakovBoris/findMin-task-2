public class findMin {
    public static void findMinInDiagonal(double[][] array){
        int j = 0;
        double min = array[array.length - 1][0];
        System.out.println("\n" + min);

        // проходим по диагонали и сравниваем с минимумом. Элемента пересечения не будет взят при проверке

        for (int i = array.length - 1; i > -1 ; i--) {
            if (array[i][j] < min & i != array.length / 2) {
                min = array[i][j];
            }
            j++;
        }
        System.out.println("\nmin = " + min);
    }
}
