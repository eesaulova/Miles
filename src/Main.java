public class Main {
    public static void main(String[] args) {
        int ticketTotalCost = 1113; //общая стоимость билета
        int bonus = 20; //количество рублей, за которые начисляется 1 миля

        System.out.println("Будет начислено:");
        System.out.println((ticketTotalCost/bonus) + " бонусных миль");
    }
}
