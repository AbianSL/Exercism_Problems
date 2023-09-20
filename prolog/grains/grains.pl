square(SquareNumber, Value):-
  SquareNumber > 0,
  SquareNumber =< 64,
  Value is 2 ** (SquareNumber - 1).

calculate_to(1, Total):-
  square(1, Value),
  Total is Value + Total.

calculate_to(SquareNumber, Total):-
  square(SquareNumber, Value),
  Total is Value + Total,
  calculate_to(SquareNumber - 1, Total).

total(Value):-
  Value is 0,
  calculate_to(64, Value).


