#include "nth_prime.h"

#include <vector>
#include <iostream>

namespace nth_prime {
  unsigned int nth(const unsigned int kNumberIntroduced) {
    if(kNumberIntroduced == 0) {
      throw std::domain_error("the number introduced must not be 0");
    }
    std::vector<unsigned int> prime_numebers{2,3,5,7};
    for (int counter{11};prime_numebers.size() < kNumberIntroduced; counter += 2) {
      for(size_t counter_for_vector{0}; counter_for_vector < prime_numebers.size(); ++counter_for_vector) {
        if ((counter % prime_numebers[counter_for_vector] ) == 0) {
          break;
        } else if (counter_for_vector  == (prime_numebers.size() - 1)) {
          prime_numebers.push_back(counter);
        }
      }
    }
    return prime_numebers[kNumberIntroduced - 1];
  }
}  // namespace nth_prime