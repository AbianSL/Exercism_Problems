%! create(+DimTuple)
%
% The create/1 predicate succeeds if the DimTuple contains valid chessboard 
% dimensions, e.g. (0,0) or (2,4).
create((DimX, DimY)) :-
  and(and(DimX < 8, DimX > 0), and(DimY < 8, DimY > 0)).

%! attack(+FromTuple, +ToTuple)
%
% The attack/2 predicate succeeds if a queen positioned on ToTuple is 
% vulnerable to an attack by another queen positioned on FromTuple.
attack((FromX, FromY), (ToX, ToY)):-
  (or(FromX is ToX, FromY is ToY) ->
  		true
   ; abs(FromX - ToX) =:= abs(FromY - ToY) ->
   		true
   ; fail
  ).

and(A,B):- A, B.
or(A,B):- A ; B.
abs(A):- (A < 0 ->
             not(A)   
          ; A
         ).
