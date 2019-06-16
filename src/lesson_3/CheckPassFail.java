/*Написать программу с названием “CheckPassFail”, которая выводит PASS если переменная
        “mark” типа int больше или равно 50 или вывести “FAIL” в противном случае.
        Программа всегда должна перед выходом печатать “DONE”*/

package lesson_3;

public class CheckPassFail {
    public static void main(String[] args) {
       int mark = 30;

        if (mark >= 50) {
           System.out.println("PASS");
       } else {
           System.out.println("FAIL");
       }

        System.out.println("DONE");
    }
}
