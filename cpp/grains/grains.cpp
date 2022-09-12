#include "grains.h"

namespace grains {

  unsigned long long square(const unsigned long long kNumber) {
    if (kNumber == 1) {
      return kNumber; 
    }
    return square(kNumber - 1) * 2;
  }

  unsigned long long total() {
    unsigned long long amount {0};
    for(int counter {1}; counter <= 64; ++counter) {
      amount += square(counter);
    }
    return amount;
  }
}  // namespace grains
