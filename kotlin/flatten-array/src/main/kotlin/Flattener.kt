object Flattener {
  fun flatten(source: Collection<Any?>): List<Any> {
    var result: MutableList<Any> = mutableListOf()
    source.forEach {
      if (it != null) {
        if (it is List<*> || it is Array<*>) {
          result.add(flatten(it as Collection<*>))
        } else {
          result.add(it)
        }
      }
    }
    return result
  }
}
