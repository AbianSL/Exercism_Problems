square(SquareNumber, Value):-
  SquareNumber > 0,
  SquareNumber =< 64,
  Value is 2 ** (SquareNumber - 1).

calculate_to(Result, 0, Result).

calculate_to(Result, SquareNumber, Total):-
  square(SquareNumber, Value),
  NewTotal is Value + Total,
  NewSquareNumber is SquareNumber - 1,
  calculate_to(Result, NewSquareNumber, NewTotal).

total(Value):-
  calculate_to(Value, 64, 0).
