package converters;
import java.util.Scanner;
import java.util.logging.Logger;
public class Main {
    public static void main(String[] args){
        Logger log = Logger.getLogger("Convert");
        Scanner in = new Scanner(System.in);
        System.out.println("Для перевода байтов в килобайты \n К-Ф," +
                "\nДля перевода килобатов в байты, введите\n Ф-К");

        String str = in.nextLine();
        float course = 2.20462f;

        if (str.equals("К-Ф")) {
            try {
                System.out.println("Введите килограммы");
                float number = in.nextFloat();
                System.out.println(number * course + " фунтов");
                log.info("\n" + "lb");
            } catch (Exception ex) {
                System.out.println("Вы ввели неправильные данные");
                log.info("error");
            }
        } else if (str.equals("Ф-К")) {
            try {
                System.out.println("Введите фунты");
                float number = in.nextFloat();
                System.out.println(number / course + " килограммов");
                log.info("kg");
            } catch (Exception ex) {
                System.out.println("Вы ввели неправильные данные");
                log.info("error");
            }

        }
        else{
            System.out.println("Вы ввели неправильные данные");
            log.info("error");
        }
    }
}