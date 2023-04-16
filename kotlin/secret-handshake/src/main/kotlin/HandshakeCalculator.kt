import Signal.*

object HandshakeCalculator {
  fun calculateHandshake(number: Int): List<Signal> {
    val handshake = mutableListOf<Signal>()
    var copy = number
    while (copy > 0) {
      if (copy - 16 >= 0) {
        copy -= 16
        handshake.reverse()
      } else if (copy - 8 >= 0) {
        copy -= 8
        handshake.add(JUMP)
      } else if (copy - 4 >= 0) {
        copy -= 4
        handshake.add(CLOSE_YOUR_EYES)
      } else if (copy - 2 >= 0) {
        copy -= 2
        handshake.add(DOUBLE_BLINK)
      } else if (copy - 1 >= 0) {
        copy -= 1
        handshake.add(WINK)
      }
    }
    return handshake 
  }
}
