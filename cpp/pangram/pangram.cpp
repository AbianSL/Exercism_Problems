#include "pangram.h"

namespace pangram {
  bool is_pangram(const std::string &kPhrase) {
    bool it_is {0};
    for (auto i : kPhrase) {
      it_is = 0;
      for (int j{'A'}; i < 'z'; ++i) {
        if (j == 'z' + 1) {
          j += 'a' - 'A';
        } else if (i == j) {
          it_is = 1;
          break;
        }
      }
    }
    return it_is;
  }
}  // namespace pangram
