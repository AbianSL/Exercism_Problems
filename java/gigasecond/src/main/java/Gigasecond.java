import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {
    public Gigasecond(LocalDate moment) {
      moment_ = moment.atTime(0, 0); 
      moment_.plusSeconds(1000000000);    // one Gigasecond added
    }

    public Gigasecond(LocalDateTime moment) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public LocalDateTime getDateTime() {
      return moment_;
    }
  
  private LocalDateTime moment_;
}
