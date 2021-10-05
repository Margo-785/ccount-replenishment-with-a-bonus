public class Main {
    public static void main(String[] args) {

        int currentAmount = 100;//текущий счет клиента
        int replenishmentAmount = 1000;//сумма для пополнения счета

        int rublesToGetBonus = 100;//минимальная сумма для определения бонуса
        int bonusAmount = replenishmentAmount / rublesToGetBonus;//вычиление суммы бонуса
        boolean bonusIsGot = replenishmentAmount >= 1000;//условие, что бонус будет получен, если сумма пополнения>/= 1000
        int totalAmountWithoutBonus = currentAmount + replenishmentAmount;
        //вычисление итоговой суммы после пополнения (без бонуса)
        boolean isCalculatedWithoutBonus = false;
        int totalAmountWithBonus = currentAmount + replenishmentAmount + bonusAmount;
        //вычисление итоговой суммы после пополнения (с бонусом)
        boolean accountIsRefilled = true;

        if (bonusIsGot == true && accountIsRefilled == true && isCalculatedWithoutBonus == false) {
            System.out.println("Ваш счет пополнен и составляет:");
            System.out.println(totalAmountWithBonus);
            System.out.println("Ваш бонус за пополнение счета от 1000 рублей составляет:");
            System.out.println(bonusAmount);
        } else {
            System.out.println("Ваш счет пополнен и составляет:");
            System.out.println(totalAmountWithoutBonus);
        }
    }
}

