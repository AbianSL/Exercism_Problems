class Triangle<out T : Number>(private val a: T, private val b: T, private val c: T) {
  val isEquilateral: Boolean = (a == b && a == c && b == c) 
  val isIsosceles: Boolean = (a == b && a != c) ||
                             (a == c && a != b) ||
                             (b == c && a != b)
  val isScalene: Boolean = (a != b && a != c && b != c)
}
