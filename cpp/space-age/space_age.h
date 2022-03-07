#if !defined(SPACE_AGE_H)
#define SPACE_AGE_H

namespace space_age {
  class space_age{
   public:
    space_age(const int kNumberIntroduced) :  seconds_{kNumberIntroduced} {} 
    /// getters
    int seconds() const { return seconds_; }
   private:
    int seconds_;
  };
  
}  // namespace space_age

#endif // SPACE_AGE_H