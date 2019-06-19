/*Сумма покупки составляет а рублей. Если а больше 1000 рублей, то предоставляется скидка 15%.
 Вывести на экран сумму покупки с учетом скидки либо сообщение о том, что скидка не предоставляется.*/

package lesson_3;

public class AmountOfDiscount {
    public static void main(String[] args) {

        double purchaseAmount = 1001;

        if (purchaseAmount > 1000) {
            purchaseAmount = purchaseAmount * 0.85;
            System.out.println("Purchase amount with discount = " + purchaseAmount);

        } else {
            System.out.println("No discount");
        }
    }
}
