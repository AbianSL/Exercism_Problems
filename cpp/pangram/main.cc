#include "pangram.h"

#include <iostream>

int main() {
  std::cout << pangram::is_pangram("the quick brown fox jumps over the lazy dog") << std::endl;
  return 0;
}