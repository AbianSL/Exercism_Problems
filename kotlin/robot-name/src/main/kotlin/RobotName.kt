class Robot {

    var name: String = GenerateName()

    fun reset() {
      name = GenerateName()
    }

    private fun GenerateName(): String {
      return ('A'..'Z').random().toString() + ('A'..'Z').random().toString() + (100..999).random().toString() 
    } 
}
