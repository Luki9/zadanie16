import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Lab {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        ZoneId zoneId = ZoneId.of("Europe/Warsaw");


        System.out.println("O której godzinie idziesz do pracy");
        String data = scanner.nextLine();

        LocalDateTime dateTimeStart = LocalDateTime.parse(data, dateTimeFormatter);
        ZonedDateTime zdt = ZonedDateTime.of(dateTimeStart, zoneId);

        System.out.println("Ile godzin bedziesz pracowal");
        int hours = scanner.nextInt();
        ZonedDateTime dateTimeEnd = zdt.plusHours(hours);

        System.out.println("Kiedy idziesz do domu" + dateTimeEnd);







    }

}
