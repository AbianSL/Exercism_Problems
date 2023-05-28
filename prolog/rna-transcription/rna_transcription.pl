complement('C', 'G').
complement('G', 'C').
complement('A', 'T').
complement('U', 'A').
complement('T', 'A').

rna_transcription(Rna, Dna):-
  string_chars(Rna, Rnda_seq),
  maplist(complement, Rnda_seq, Dna_seq),
  string_chars(Dna, Dna_seq).
