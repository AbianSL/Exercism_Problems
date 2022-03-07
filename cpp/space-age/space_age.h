#if !defined(SPACE_AGE_H)
#define SPACE_AGE_H

namespace space_age {
  class space_age{
   public:
    space_age(const int kNumberIntroduced) :  seconds_{kNumberIntroduced} {} 
    /// getters
    double on_earth() const;
    double on_venus() const;
    double on_mercury() const;
    double on_mars() const;
    double on_jupiter() const;
    double on_saturn() const;
    double on_uranus() const;
    double on_neptune() const;
    int seconds() const { return seconds_; }
   private:
    int seconds_;
  };
  
}  // namespace space_age

#endif // SPACE_AGE_H