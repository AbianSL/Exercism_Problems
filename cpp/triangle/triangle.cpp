#include "triangle.h"

namespace triangle {
  enum flavor{
    equilateral,
    isosceles,
    scalene
  }
   flavor kind(const int kFirst, const int kSecond, const int kThird) {
    if ((kFirst == kSecond) && (kSecond == kThird)) {
      return  equilateral;
    }

    switch () {
      case :
          
        break;

      default:
        throw std::domain_error;
        break;
    }
  } 
}  // namespace triangle
}  // namespace triangle
