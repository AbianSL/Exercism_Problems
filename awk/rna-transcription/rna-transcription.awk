BEGIN {
  result = ""
  split($0, dna_seq, "")
  for (i = 0; i < length(dna_seq); ++i) {
    if (dna_seq[i] == "A") {
      result = result "T"
    } else if (dna_seq[i] == "T") {
      result = result "A"
    } else if (dna_seq[i] == "C") {
      result = result "G"
    } else if (dna_seq[i] == "G") {
      result = result "C"
    } 
  }
  print result
}
