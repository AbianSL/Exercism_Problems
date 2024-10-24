#if !defined(TRIANGLE_H)
#define TRIANGLE_H

namespace triangle {
  enum flavor{
    equilateral,
    isosceles,
    scalene
  };
  flavor kind(const double, const double, const double);
}
#endif // TRIANGLE_H