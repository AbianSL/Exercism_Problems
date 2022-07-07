#include "pangram.h"

namespace pangram {
  bool is_pangram(const std::string &kPhrase) {
    bool it_is [26];
    bool pangram[26] = {1};
    for (auto i : kPhrase) {
      if (i >= 'a') {
        i -= 'a' - 'A'; 
      }
      i -= 'A';
      int position {i};
      it_is[position] = 1;
    }
    if (it_is == pangram) {
      return 1;
    }
    return 0;
  }
}  // namespace pangram
