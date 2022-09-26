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
      if ((phrase[i] - 'Z') < 0) {
        phrase[i] + ('a' - 'A');
      }
      const char kCharacter {phrase[i] + (phrase[i] - 'n')};
      final_phrase += kCharacter;
    }
    return {final_phrase};
  }
}  // namespace atbash_cipher
