import java.time.LocalDateTime
import java.time.LocalDate
import java.time.LocalTime

class Gigasecond(input_date: LocalDate) {
  
  val one_gigasecond: LocalTime = LocalTime.ofSecondOfDay(1000000000)
  // TODO: Implement proper constructor
  val date: LocalDateTime = input_date.atTime(one_gigasecond) 
}
