isogram(Phrase):-
    string_lower(Phrase, Lower),
    string_chars(Lower, Chars),
    sort(Chars, Sorted).
