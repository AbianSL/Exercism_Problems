data class MatrixCoordinate(val row: Int, val col: Int)

class Matrix(val matrix: List<List<Int>>) {
  
  // private val saddlePoints: Set<MatrixCoordinate> 
 
  private fun row(row: Int): List<Int> {
    return matrix[row - 1]
  }

  private fun column(col: Int): List<Int> {
    return matrix.map { it[col - 1] }
  }

  private fun minRow(position: MatrixCoordinate): Boolean {
    for (i in 1..matrix.get(position.row).size) {
      if (matrix[position.row][i] > matrix[position.row][position.col]) {
        return false
      }
    }
    return true
  }
}
