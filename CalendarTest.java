import java.time.*;


public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); //set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int Value = weekday.getValue();//1 = Monday ,....7 = sunday
        System.out.println("Mon Tue wed thu fri sat sun");
        for ( int i = 1; i < Value; i++) {
            System.out.println("   ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getMonthValue() == today)
                System.out.println("*");
            else
                System.out.println("       " );
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}


