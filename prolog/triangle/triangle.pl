triangle(Side1, Side2, Side3, Type) :-
    is_triangle(Side1, Side2, Side3), is_right_type(Side1, Side2, Side3, Type).
    

is_triangle(Side1, Side2, Side3):- 
    (Side1 =< 0 ->
        fail
    ; Side2 =< 0 ->
        fail
    ; Side3 =< 0 ->
        fail
    ;
    Side1 + Side2 >= Side3, Side1 + Side3 >= Side2, Side2 + Side3 >= Side1
).

is_right_type(Side1, Side2, Side3, Type):-
    ( Type == "equileteral" ->
        is_equileteral(Side1, Side2, Side3)
      ; Type == "isosceles" ->
        is_isosceles(Side1, Side2, Side3)
      ; Type == "scalene" ->
        is_scalene(Side1, Side2, Side3)
    ).

is_equileteral(Side1, Side2, Side3).

is_isosceles(Side1, Side2, Side3):-
    Side1 =:= Side2; Side2 =:= Side3.

is_scalene(Side1, Side2, Side3):-
    Side1 \= Side2, Side1 \= Side2, Side3 \= Side2.

and(A,B):- is_true(A), is_true(B).