

class Robot {

    val name: String
        get() = ('A'..'Z').random().toString() + ('A'..'Z').random().toString() + (100..999).random().toString() 

    fun reset() {
        TODO("Implement this function to complete the task")
    }
}
