#include "space_age.h"

namespace space_age {
  double space_age::on_earth() const {
    double year_on_earth {space_age::seconds() * 1.0}; /// convert to double
    return year_on_earth /= 31557600;
  }
}  // namespace space_age
