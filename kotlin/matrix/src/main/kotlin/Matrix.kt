class Matrix(private val matrixAsString: String) {
    // Atributtes
    private val MatrixList: List<List<Int>> = PassToInt() 

    private fun PassToInt(): List<List<Int>>{
      var aux: MutableList<Int> = mutableListOf<Int>() 
      var result: MutableList<List<Int>> = mutableListOf<List<Int>>() 
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
      var CountCol: Int = 0
      MatrixList.forEach {
        if (CountCol == colNr) {
          return it 
        } 
      }
      return emptyList()
    }

    fun row(rowNr: Int): List<Int> {
      return MatrixList[rowNr]
    }
}
