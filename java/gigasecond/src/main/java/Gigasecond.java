import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {
    public Gigasecond(LocalDate moment) {
      moment_ = moment.atTime(0, 0);
    }

    public Gigasecond(LocalDateTime moment) {
      moment_ = moment;
    }

    public LocalDateTime getDateTime() {
      return moment_.plusSeconds(1000000000);  // one Gigasecond added
    }
  
  private LocalDateTime moment_;
}
