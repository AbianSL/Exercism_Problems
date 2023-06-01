isogram(Phrase):-
    string_lower(Phrase, Lower),
    string_chars(Lower, Chars),
    include(=(' '), Chars, NoSpaces),
    include(=('-'), NoSpaces, NoDashes),
    sort(NoDashes, SortedNoDashes),
    length(NoDashes, Length),
    length(SortedNoDashes, Length).
