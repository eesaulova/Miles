public class BonusMilesService {
    public int calculate(int cost) { // общая стоимость билета
        int amountForBonus = 20; // количество руб., за которые начисляется 1 миля
        int bonus = cost / amountForBonus; // формула расчета миль

        return bonus; // возвращаем рассчитанный bonus
    }
}



