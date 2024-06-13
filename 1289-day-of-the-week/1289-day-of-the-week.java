import java.time.*;
import java.time.format.DateTimeFormatter;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        return LocalDate.of(year, month, day).format(DateTimeFormatter.ofPattern("EEEE"));
    }
}