nucleotide_count('A', 1, 0, 0, 0).
nucleotide_count('C', 0, 1, 0, 0).
nucleotide_count('G', 0, 0, 1, 0).
nucleotide_count('T', 0, 0, 0, 1).

nucleotide_count(Dna, Result) :-
  nucleotide_count(Dna, 0, 0, 0, 0, Result).
