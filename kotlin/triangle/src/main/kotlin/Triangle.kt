class Triangle<out T : Number>(private val a: T, private val b: T, private val c: T) {
  init {
    if (a == 0 || b == 0 || c == 0) {
      throw IllegalArgumentException("It is not a triangle")  
    }
  }
   val isEquilateral: Boolean = (a == b && a == c && b == c) 
  val isIsosceles: Boolean = (a == b && a != c) ||
                             (a == c && a != b) ||
                             (b == c && a != b)
  val isScalene: Boolean = (a != b && a != c && b != c)
}
