calculator([Digit|Rest], Len, Dec):-
  Len > 0,
  Len is Len - 1,
  (Digit == '0' -> 
    Bin is 0
  
    ; Bin is 1
  ),
  Dec is Dec + Bin * (2 ** Len),
  calculator(Rest, Len, Dec).

binary(Str, Dec):-
  string_chars(Str, Chars),
  reverse(Chars, RevChars),
  length(RevChars, Len),
  calculator(RevChars, Len, Dec).

binary("0", 0).
binary("1", 1).
