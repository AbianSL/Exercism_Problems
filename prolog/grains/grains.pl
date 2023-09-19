square(SquareNumber, Value):-
  SquareNumber > 0,
  SquareNumber =< 64,
  Value is 2 ** (SquareNumber - 1).

calculate_to(SquareNumber, Total):-
  SquareNumber > 0,
  SquareNumber =< 64,
  calculate_to(SquareNumber - 1, Total).

total(Value):-
  calculate_to(64, Value).


