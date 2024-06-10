import java.time.*;
import java.time.format.DateTimeFormatter;
class Solution {
    public int dayOfYear(String date) {

        return Integer.valueOf(LocalDate.parse(date).format(DateTimeFormatter.ofPattern("D"))); 
    } 
}