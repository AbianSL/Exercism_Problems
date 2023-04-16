import Signal.*

object HandshakeCalculator {
  fun calculateHandshake(number: Int): List<Signal> {
    val handshake = mutableListOf<Signal>()
    when (number) {
      1 -> handshake.add(Signal.WINK)
      2 -> handshake.add(Signal.DOUBLE_BLINK)
      4 -> handshake.add(Signal.CLOSE_YOUR_EYES)
      8 -> handshake.add(Signal.JUMP)
      16 -> handshake.reverse()
    }
    return handshake 
  }
}
