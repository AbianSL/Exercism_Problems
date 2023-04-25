data class MatrixCoordinate(val row: Int, val col: Int)

class Matrix(val matrix: List<List<Int>>) {
  
  val saddlePoints: Set<MatrixCoordinate> = SearchSaddlePoint() 

  private fun minRow(position: MatrixCoordinate): Boolean {
    for (i in 0..matrix.get(position.row).size - 1) {
      if (matrix[position.row][i] > matrix[position.row][position.col]) {
        return false
      }
    }
    return true
  }
  
  private fun maxCol(position: MatrixCoordinate): Boolean {
    for (i in 0..matrix.size - 1) {
      if (matrix[i][position.col] < matrix[position.row][position.col]) {
        return false
      }
    }
    return true
  }

  private fun SearchSaddlePoint(): Set<MatrixCoordinate> {
    var saddlePoints = mutableSetOf<MatrixCoordinate>()
    for (i in 0..(matrix.size - 1)) {
      for (j in 0..(matrix[i].size - 1)) {
        if (minRow(MatrixCoordinate(i, j)) && maxCol(MatrixCoordinate(i, j))) {
          saddlePoints.add(MatrixCoordinate(i + 1, j + 1))
        }
      }
    }
    return saddlePoints
  }
}
