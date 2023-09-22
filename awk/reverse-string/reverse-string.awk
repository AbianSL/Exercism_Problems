BEGIN {
}

END { 
  split($0, words, "")
  for (i = length(words); i >= 0; i--) {
    printf words[i]
  }
}
