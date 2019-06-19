/*Известны площади круга и квадрата. Определить:
уместится ли круг в квадрате
уместится ли квадрат в круге
*/

package lesson_3;

public class Square {
    public static void main(String[] args) {

        double squareArea = 50;
        double circlArea = 100;

        double circleDiameter = 2 * Math.sqrt(circlArea / 3.14);
        double squareSide = Math.sqrt(squareArea);
        double squareDiagonal = Math.sqrt(2 * squareSide * squareSide);

        if (squareDiagonal <= circleDiameter) {
            System.out.println("Квадрат уместится в круге");

        } else {
            System.out.println("Круг уместится в квадрате");
        }
    }
}
