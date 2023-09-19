nucleotide_count('A', 1).
nucleotide_count('C', 1).
nucleotide_count('G', 1).
nucleotide_count('T', 1).

nucleotide_count(Dna, Result) :-
  nucleotide_count(Dna, Result),
  Result is Result + 1.
