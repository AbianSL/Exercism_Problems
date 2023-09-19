square(SquareNumber, Value):-
  SquareNumber > 0,
  SquareNumber =< 64,
  Value is 2 ** (SquareNumber - 1).

total(Value):-
  square(64, Value).
