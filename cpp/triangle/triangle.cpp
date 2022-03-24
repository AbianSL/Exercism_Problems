#include <iostream>

#include "triangle.h"

namespace triangle {
  triangle::flavor kind(const double kX, const double kY, const double kZ) {
    if ((kX <= 0) || (kY <= 0) || (kZ <= 0) || (kZ > kX + kY) ||
        !((kX + kY >= kZ) && (kY + kZ >= kX) && (kZ + kX >= kY))) {
      throw std::domain_error("Invalid Triangle");
    } else if ((kX == kY) && (kY == kZ)) {
      return flavor::equilateral;
    } else if ((kX == kY) ^ (kY == kZ) ^ (kZ == kX)) {
      return flavor::isosceles; 
    } else {
      return flavor::scalene;
    }
  }
}  // namespace triangle
