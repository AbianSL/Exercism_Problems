pangram(Sentence):-
  Alphabet = "abcdefghijklmnopqrstuvwxyz",
  string_lower(Sentence, Lower),
  string_chars(Lower, Chars),
  include(\=(' '), Chars, NoSpaces),
  include(\=('-'), NoSpaces, NoDashes),
  include(\=('.'), NoDashes, NoDots),
  include(\=('_'), NoDots, NoUnderscores),
  sort(NoUnderscores, Sorted),
  string_chars(Alphabet, Sorted).
