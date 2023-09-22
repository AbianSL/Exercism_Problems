BEGIN {
  split($0, words, " ")
  for (i = length(words); i >= 0; i--) {
    print(words[i])
  }
}
