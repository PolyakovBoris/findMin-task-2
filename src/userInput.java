import java.util.Scanner;

public class userInput {
    public static int userInputValidation () {
        System.out.println("введите нечётное число  >= 3");
        Scanner scanner = new Scanner(System.in);
        boolean validNumber = false;
        int intValue = 0;

        while (validNumber == false) {
            String userInput = scanner.nextLine();
            try {
                intValue = Integer.parseInt(userInput);
                if (intValue > 2 & intValue % 2 > 0) {
                    System.out.println("валидное число");
                    validNumber = true;
                } else {
                    System.out.println("введите нечётное число  >= 3");
                }
            } catch (NumberFormatException e) {
                System.out.println("введите ЧИСЛО");
            }
        }
        return intValue;
    }
}