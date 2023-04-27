fun transcribeToRna(dna: String): String {
  var result = StringBuilder(dna)
  dna.forEachIndexed { i, it ->
    when (it) {
      'G' -> result[i] = 'C'
      'C' -> result[i] = 'G'
      'T' -> result[i] = 'A'
      'A' -> result[i] = 'U'
      
    }
  }
  return result.toString() 
}
