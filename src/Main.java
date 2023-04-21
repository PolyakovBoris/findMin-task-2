public class Main {
    public static void main(String[] args) {

//        Запрашиваем у пользователя число N (где N >= 3 и является нечётным числом)
        int userNumber = userInput.userInputValidation();

//        Создаём двумерный числовой массив размерности NxN и заполняем его случайными дробными числами
//        в диапазоне (0.00  – 99.99). Выводим полученный массив в консоль
        double array [][] = createArray.createArrayAndFill(userNumber);

//        Находим минимальный элемент побочной диагонали без учёта элемента пересечения главной и побочной диагонали.
//        и выводим в консоль найденный элемент
        findMin.findMinInDiagonal(array);


    }
}