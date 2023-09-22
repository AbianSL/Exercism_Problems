BEGIN {
  if (ARGC == 2) {
    getline phrase < ARGV[1] 
  }
}

END { 
  for (i = length(phrase); i >= 0; i--) {
    print phrase[i]
  }
}
