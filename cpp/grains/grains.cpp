#include "grains.h"

namespace grains {

  unsigned square(const unsigned kNumber) {
    if (kNumber == 1) {
      return kNumber; 
    }
    return square(kNumber - 1) * 2;
  }
}  // namespace grains
