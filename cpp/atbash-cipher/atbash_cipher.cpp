#include "atbash_cipher.h"

namespace atbash_cipher {
  /**
   * @brief that funciton is to encode the phrase introduced
   * 
   * @param phrase is the copy of the phrase to encode
   * @return const std::string is the phrase encoded
   */
  const std::string encode(std::string phrase) {
    std::string final_phrase {""};
    unsigned count_letter{0};

    for(unsigned i{0}; i < phrase.length(); ++i) {
      if (!((phrase[i] <= 'z' 
            && phrase[i] >= 'a')
            || (phrase[i] >= '0' 
            && phrase[i] <= '9')
            || (phrase[i] <= 'Z' 
            && phrase[i] >= 'A'))){
        continue;
      }

      if ((phrase[i] <= 'Z') 
          && (phrase[i] >= 'A')) {
        phrase[i] = phrase[i] + ('a' - 'A');
      }

      if ((count_letter % 5 == 0) ^ (count_letter == 0)) {
        final_phrase += " ";
      }

// I need to comment that later
      if (phrase[i] <= 'z' 
          && phrase[i] >= 'a') {
        final_phrase += phrase[i] + ('z' - 'a' - (phrase[i] - 'a')) - (phrase[i] - 'a');
      } else {
        final_phrase += phrase[i];
      }
      ++count_letter;
    }
    return {final_phrase};
  }
}  // namespace atbash_cipher
