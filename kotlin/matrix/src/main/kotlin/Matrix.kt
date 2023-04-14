class Matrix(private val matrixAsString: String) {
    // Atributtes
    val MatrixList: List<List<Int>> = PassToInt() 

    private fun PassToInt(): List<List<Int>>{
      var aux: MutableList<Int> = mutableListOf<Int>() 
      var result: MutableList<List<Int>> = mutableListOf<List<Int>>()

      var line: String = ""
      matrixAsString.forEach { 
        if (it == '\n') {
          aux.add(line.toInt())
          result.add(aux.toList())
          line = ""
          aux.clear()
        } else if (it == ' ') {
          aux.add(line.toInt())
          line = ""
        } else {
          line += it
        }
      }
      if (line != "") {
        aux.add(line.toInt())
        result.add(aux.toList())
      }
      return result.toList()
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
      return MatrixList[rowNr - 1]
    }
}

