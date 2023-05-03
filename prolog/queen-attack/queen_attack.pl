and(A,B):- is_true(A), is_true(B).
or(A,B):- is_true(A) ; is_true(B).

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
	 ; FromX - ToX is FromY - ToY ->
	 		true
	 ; fail
  ).