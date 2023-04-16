data class MatrixCoordinate(val row: Int, val col: Int)

class Matrix(val matrix: List<List<Int>>) {
  
  val saddlePoints: Set<MatrixCoordinate> = SearchSaddlePoint() 
 
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
  
  private fun maxCol(position: MatrixCoordinate): Boolean {
    for (i in 1..matrix.size) {
      if (matrix[i][position.col] < matrix[position.row][position.col]) {
        return false
      }
    }
    return true
  }

  private fun SearchSaddlePoint(): Set<MatrixCoordinate> {
    for (i in 1..matrix.size) {
      for (j in 1..matrix[i].size) {
        if (minRow(MatrixCoordinate(i, j)) && maxCol(MatrixCoordinate(i, j))) {
          return setOf(MatrixCoordinate(i, j))
        }
      }
    }
    return setOf()
  }
}
