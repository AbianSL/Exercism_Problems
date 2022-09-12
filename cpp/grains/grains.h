#if !defined(GRAINS_H)
#define GRAINS_H

namespace grains {
  unsigned square(const unsigned kNumber) {
    if (kNumber == 0) {
      return kNumber * 2; 
    }
    return square(kNumber - 1) * 2;
  }
}  // namespace grains

#endif // GRAINS_H