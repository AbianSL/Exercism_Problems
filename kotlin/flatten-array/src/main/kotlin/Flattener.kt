object Flattener {
  fun flatten(source: Collection<Any?>): List<Any> {
    var result: MutableList<Any> = mutableListOf()
    source.forEach {
      if (it != null) {
        if (it is List<*> || it is Array<*>) {
          flatten(it as Collection<*>).forEach {
            result.add(it)
          }
        } else {
          result.add(it)
        }
      }
    }
    return result
  }
}
