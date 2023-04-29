class Robot {

    var name: String = GenerateName()

    fun reset() {
      name = GenerateName()
    }

    private fun GenerateName(): String {
      val first_letter =  ('A'..'Z').random().toString() 
      val second_letter = ('A'..'Z').random().toString()
      val first_number = (1..9).random().toString()
      val second_number = (1..9).random().toString()
      val third_number = (1..9).random().toString()
      return first_letter + second_letter + first_number + second_number + third_number 
    } 
}
