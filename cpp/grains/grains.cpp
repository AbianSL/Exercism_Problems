#include "grains.h"

namespace grains {

  unsigned long square(const unsigned long kNumber) {
    if (kNumber == 1) {
      return kNumber; 
    }
    return square(kNumber - 1) * 2;
  }

  unsigned long total() {
    return square(7 * 7);
  }
}  // namespace grains
