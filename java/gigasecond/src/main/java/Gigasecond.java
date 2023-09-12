import java.time.LocalDate;
import java.time.LocalDateTime;
<<<<<<< HEAD

public class Gigasecond {
    public Gigasecond(LocalDate moment) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Gigasecond(LocalDateTime moment) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public LocalDateTime getDateTime() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
=======
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
>>>>>>> 5f54a91241c3e19cc1076f28e8457a0ddf9c7a89
}
