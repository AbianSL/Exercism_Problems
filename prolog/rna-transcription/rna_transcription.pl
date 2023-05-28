complement('C', 'G').
complement('G', 'C').
complement('A', 'U').
complement('T', 'A').

rna_transcription(Rna, Dna):-
  string_chars(Rna, Rnda_seq),
  maplist(complement, Rnda_seq, Dna_seq),
  string_chars(Dna, Dna_seq).
