import java.time.LocalDateTime
import java.time.LocalDate
import java.time.LocalTime

class Gigasecond {
 
  private val one_gigasecond: Long = 1000000000
  constructor(input_date: LocalDate) { 
    this.date = LocalDateTime.of(input_date, LocalTime.of(0, 0)).plusSeconds(one_gigasecond)  
  }
  // TODO: Implement proper constructor
  constructor (input_date: LocalDateTime) {
    this.date = input_date.plusSeconds(one_gigasecond)
  }

  val date: LocalDateTime 
}
