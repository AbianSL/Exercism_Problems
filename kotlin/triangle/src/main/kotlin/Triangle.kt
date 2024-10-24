class Triangle<out T : Number>(val a: T, val b: T, val c: T) {
  init {
    val IsTriangle: Boolean = (a.toDouble() + b.toDouble() > c.toDouble()) &&
                              (a.toDouble() + c.toDouble() > b.toDouble()) &&
                              (b.toDouble() + c.toDouble() > a.toDouble())
    if (!IsTriangle) {
      throw IllegalArgumentException("It is not a triangle")
    }
  }
   val isEquilateral: Boolean = (a == b && a == c && b == c) 
  val isIsosceles: Boolean = (a == b && a != c) ||
                             (a == c && a != b) ||
                             (b == c && a != b) ||
                             isEquilateral
  val isScalene: Boolean = (a != b && a != c && b != c)
}
