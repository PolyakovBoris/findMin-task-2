import java.util.concurrent.ThreadLocalRandom;

public class createArray {
    public static double[][] createArrayAndFill(int sizeArray){
        double[][] array = new double [sizeArray][sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < sizeArray; j++) {
                double number = ThreadLocalRandom.current().nextDouble(0.00, 99.99);
                number = Math.round(number * 100);
                number = number/100;
                array[i][j] = number;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }
}