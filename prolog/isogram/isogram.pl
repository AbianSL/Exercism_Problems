isogram(Phrase):-
    string_lower(Phrase, Lower),
    string_chars(Lower, Chars),
    include(\=(' '), Chars, NoSpaces),
    include(\=('-'), NoSpaces, NoDashes),
    is_set(NoDashes).
