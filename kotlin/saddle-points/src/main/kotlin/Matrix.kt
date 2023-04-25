data class MatrixCoordinate(val row: Int, val col: Int)

class Matrix(val matrix: List<List<Int>>) {
  
  val saddlePoints: Set<MatrixCoordinate> = SearchSaddlePoint() 

  private fun minRow(position: MatrixCoordinate): Boolean {
    if (matrix.size == 1) {
      return false
    }
    for (i in 0..matrix.get(position.row).size - 1) {
      if (matrix[position.row - 1][i] > matrix[position.row - 1][position.col - 1]) {
        return false
      }
    }
    return true
  }
  
  private fun maxCol(position: MatrixCoordinate): Boolean {
    if (matrix.size == 1) {
      return false
    }
    for (i in 0..matrix.size - 1) {
      if (matrix[i][position.col - 1] < matrix[position.row - 1][position.col - 1]) {
        return false
      }
    }
    return true
  }

  private fun SearchSaddlePoint(): Set<MatrixCoordinate> {
    if (matrix.size == 1) {
      return setOf()
    }
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
