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
    for(unsigned i{0}; i < phrase.length(); ++i) {
      if ((phrase[i] - 'Z') <= 0) {
        phrase[i] = phrase[i] + ('a' - 'A');
      }
      if (!(phrase[i] <= 'z' && phrase[i] >= 'a')) {
        continue;
      }
      final_phrase += phrase[i] + ('z' - 'a' - (phrase[i] - 'a')) - (phrase[i] - 'a');
    }
    return {final_phrase};
  }
}  // namespace atbash_cipher
