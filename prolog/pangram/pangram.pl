pangram(Sentence):-
  Alphabet = "abcdefghijklmnopqrstuvwxyz",
  string_lower(Sentence, Lower),
  string_chars(Lower, Chars),
  sort(Chars, Sorted),
  string_chars(Alphabet, Sorted).
