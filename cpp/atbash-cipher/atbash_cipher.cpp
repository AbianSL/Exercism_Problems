#include "atbash_cipher.h"

namespace atbash_cipher {
  /**
   * @brief that funciton is to encode the phrase introduced
   * 
   * @param kPhrase is the phrase to encode
   * @return const std::string is the phrase encoded
   */
  const std::string encode(const std::string kPhrase) {
    char character {0};
    for(unsigned i{0}; i < kPhrase.length(); ++i) {
      if ((kPhrase[i] - 'Z') < 0) {
        character = kPhrase[i] + (kPhrase[i] - 'n');
        continue;
      }
      kPhrase[i] - 'n';
    }
  }
}  // namespace atbash_cipher
