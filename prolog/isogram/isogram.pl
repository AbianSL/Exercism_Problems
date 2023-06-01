is_isogram(Phrase):-
    All = "ABCDEFGHIJKLMNOPQRSTUVWXY",
    Chars = string_char(Phrase),
    Size = length(All),
    N = 0.
    ( N < Size ->
        ( member(, Chars) ->
            
        )
      N = N + 1
    ;).
    

isogram(Phrase):-
    is_isogram(Phrase).