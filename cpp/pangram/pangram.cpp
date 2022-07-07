#include "pangram.h"

#include <vector>

#include <iostream>

namespace pangram {
  bool is_pangram(const std::string &kPhrase) {
    std::vector<bool> it_is;
    std::vector<bool> pangram;
    for (unsigned i{0}; i < 26; ++i) {
      pangram.push_back(true);
      it_is.push_back(false);
    }
  
    for (auto i : kPhrase) {
      if (i < 'A' || 
          ('Z' < i && i < 'a') ||
          i > 'z' ) {
        continue;
      }
      if (i >= 'a') {
        i -= 'a' - 'A'; 
      }
      i -= 'A';
      int position {i};
      it_is[position] = true ;
    }
    
    if (it_is == pangram) {
      return 1;
    }
    return 0;
  }
}  // namespace pangram
