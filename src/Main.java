public class Main {
    public static void main(String[] args) {

        int balance = 800;
        int replenishment = 1300;
        int iBonus = 0;

        int bonus;
        int outcome;
        if (replenishment >= 1000) {
            bonus = replenishment / 100 * 1;
            outcome = balance + replenishment + bonus;
            System.out.println("Итоговая сумма на счету: " + outcome);
            System.out.printf("Из них бонусов: " + bonus);
        } else {
            System.out.println("Итоговая сумма на счету: " + balance);
            System.out.printf("Из них бонусов: " + iBonus);
        }
    }
}