/*Написать программу, которая сравнивает два числа типа int и определяет, какое из чисел
        большее, а какое меньшее. Программа должна вывести что-то типа “The number x has the
        greatest value”. Где “x” одно из чисел*/

package lesson_3;

public class NumberСomparison {
    public static void main(String[] args) {

        int x = 3;
        int y = 5;

        if (x != y) {

            if (x > y) {
                System.out.println("The number x has the geatest value");

            } else {
                System.out.println("The number y has the geatest value");
            }

        } else {
            System.out.println("The numbers are equal");
        }
    }
}
