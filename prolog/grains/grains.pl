square(SquareNumber, Value):-
  SquareNumber > 0,
  SquareNumber =< 64,
  Value is 2 ** (SquareNumber - 1).

calculate_to(1, Total):-
  square(1, Value),
  NewTotal is Value + Total,
  Total is NewTotal.

calculate_to(SquareNumber, Total):-
  square(SquareNumber, Value),
  NewTotal is Value + Total,
  NewSquareNumber is SquareNumber - 1,
  calculate_to(NewSquareNumber, NewTotal).

total(Value):-
  Value is 0,
  calculate_to(64, Value).
