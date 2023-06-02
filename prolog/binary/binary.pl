binary(Str, Dec):-
  string_chars(Str, Chars),
  reverse(Chars, RevChars).

binary("0", 0).
binary("1", 1).
