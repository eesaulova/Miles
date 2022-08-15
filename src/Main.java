public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        int ticketTotalCost = 1111; //общая стоимость билета
        int bonus = 20; //количество рублей, за которые начисляется 1 миля

        System.out.println("Будет начислено:");
        System.out.println((ticketTotalCost/bonus) + " бонусных миль");

    }
}
