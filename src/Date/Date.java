package Date;
    import java. time.LocalDateTime;
    import java.time.format.DateTimeFormatter;
    public class Date{


        public static void main(String[] args) {
            LocalDateTime now = LocalDateTime.now();
            System.out.println("Current time is: " + now);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String formatted = dtf.format(now);
            System.out.println("Formatted date is: " + formatted);

        }

}

