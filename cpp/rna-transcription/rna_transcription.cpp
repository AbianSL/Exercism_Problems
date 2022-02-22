#include <iostream>

#include "rna_transcription.h"

namespace rna_transcription {
   char to_rna(const char kLetter) {
    char letter_translate;
    switch (kLetter) {
      case 'G':
        letter_translate = 'C';
        break;
      case 'C':
        letter_translate = 'G';
        break;
      case 'T':
        letter_translate = 'A';
        break;
      case 'A':
        letter_translate = 'U';
        break;
      default:
        std::cerr << "the value introduced is invalid" << std::endl;
        exit(EXIT_SUCCESS);
        break;
    }
    return letter_translate;
  }
}  // namespace rna_transcription
