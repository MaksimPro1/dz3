public class Main {

    public static void main(String[] args) {
        System.out.println("Вам понадобиться" + calculation() + "чтобы купить билеты");
    }

    // задание полей
    static float ticket = 70; // стоимость билета
    static byte childPlatDiscount = 50; // скидка (в процентах) для детей
    static byte pensionersPlatDiscount = 30; // скидка (в процентах) для пенсионеров

    static float tickets = 9; // взрослый билет
    static float childtickets = 11; // детский билет
    static float pensionerstickets = 5; // пенсионерский билет

    // метод подсчёта стоимости всех билетов
    private static float calculation() {
        float count = (childtickets * (ticket-(ticket/100*childPlatDiscount)))
                + (pensionerstickets * (ticket-(ticket/100*pensionersPlatDiscount)))
                + (tickets * ticket);
        return count;

    }



}

