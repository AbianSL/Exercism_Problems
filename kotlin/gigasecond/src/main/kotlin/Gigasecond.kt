import java.time.LocalDateTime

class Gigasecond {
  
  val one_gigasecond: Long = 1000000000
  // TODO: Implement proper constructor
  constructor(input_date: LocalDateTime) {
    date = input_date.plusSeconds(one_gigasecond)
  }

  val date: LocalDateTime
}
