#if !defined(TRIANGLE_H)
#define TRIANGLE_H

namespace triangle {
  enum flavor{
    equilateral,
    isosceles,
    scalene
  };
  flavor kind(const int, const int, const int);
}
#endif // TRIANGLE_H