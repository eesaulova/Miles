public class BonusMilesService {
    public int calculate(int cost) { //общая стоимость билета
        int amountForBonus = 20; //количество рублей, за которые начисляется 1 миля
        int bonus = cost / amountForBonus; //Формула расчета миль

        return bonus; // возвращаем рассчитанный bonus
    }
}



