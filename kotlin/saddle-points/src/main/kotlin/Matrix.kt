data class MatrixCoordinate(val row: Int, val col: Int)

class Matrix(val matrix: List<List<Int>>) {
  
  // private val saddlePoints: Set<MatrixCoordinate> 
 
  private fun row(row: Int): List<Int> {
      return matrix[row - 1]
  }

  fun column(col: Int): List<Int> {
      return matrix.map { it[col - 1] }
  }  
}
