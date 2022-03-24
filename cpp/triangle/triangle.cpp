#include <iostream>

#include "triangle.h"

namespace triangle {
  triangle::flavor triangle::kind(const int kFirst, const int kSecond, const int kThird) {
    if ((kFirst == kSecond) && (kSecond == kThird)) {
      return equilateral;
    } else if ((kFirst == kSecond)) {
      return isosceles; 
    } else if ((kFirst <= 0) || (kSecond <= 0) || (kThird <= 0)) {
      throw std::domain_error("Invalid Triangle");
    } else {
      return scalene;
    }
  }
}  // namespace triangle
