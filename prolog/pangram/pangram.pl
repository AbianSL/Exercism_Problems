pangram(Sentence):-
  string_lower(Sentence, Lower),
  string_chars(Lower, Chars),
  include([X]>>char_type(X, alpha), Chars, NoUnderscores),
  include(\=(is_number), NoUnderscores, NoNumbers),
  sort(NoNumbers, Sorted),
  length(Sorted, Len),
  Len = 26.

is_number(X):- member(X, ['0','1','2','3','4','5','6','7','8','9']).
