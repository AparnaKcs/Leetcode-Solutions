// Last updated: 8/12/2026, 11:05:56 AM
import java.time.LocalDate;
class Solution {
    public int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }
}