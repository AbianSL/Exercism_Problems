class Matrix(private val matrixAsString: String) {
    // Atributtes
    private val MatrixList: List<List<Int>> = PassToInt() 

    private fun PassToInt(): List<List<Int>>{
      var aux: MutableList<Int>() 
      var result: MutableList<List<Int>>()
      matrixAsString.forEach {
        if (it == '\n') {
          result.add(aux)
          aux.clear()
        }
        if (it != ' ') {
          aux.add(it.toInt())
        }
      }
      return result
    }

    
    fun column(colNr: Int): List<Int> {
        TODO("Implement this to complete the task")
    }

    fun row(rowNr: Int): List<Int> {
        TODO("Implement this to complete the task")
    }
}
