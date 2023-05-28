rna_transcription([Letter_Rna|Rna], [Letter_Dna|Dna]):-
    ( Letter_Rna == 'C' ->
        Letter_Dna = 'G'
      
      ; Letter_Rna == 'G' ->
        Letter_Dna = 'C'
      
      ; Letter_Rna == 'A' ->
        Letter_Dna = 'T'
      
      ; Letter_Dna == 'U' ->
        Letter_Dna = 'A'
    )
    rna_transcription(Rna, Dna).
