/*Написать программу с названием “CheckOddEven”, которая печатает “Odd Number” если
        переменная “number” типа int нечетная. Или “Even Number” если переменная четная.
        Программа всегда должна перед выходом печатать “BYE”*/

package lesson_3;

public class CheckOddEven {
    public static void main(String[] args) {

        int number = 5;

        if (number%2 != 0){
            System.out.println("Odd Number");
        }else {
            System.out.println("Even Number");
        }

        System.out.println("BYE");
    }
}
