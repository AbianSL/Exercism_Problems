import java.time.LocalDateTime
import java.time.LocalDate
import java.time.LocalTime

class Gigasecond {
 
  constructor(input_date: LocalDate) {
    val one_gigasecond: LocalTime = LocalTime.ofSecondOfDay(1000000000)
    this.date = input_date.atTime(one_gigasecond)  
  }
  // TODO: Implement proper constructor
  constructor (input_date: LocalDateTime) {
    this.date = input_date.plusSeconds(1000000000)
  }

  val date: LocalDateTime 
}
