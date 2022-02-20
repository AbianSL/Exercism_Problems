#include <iostream>
#include <string>

/// temaplate is for only use one function instead two or more function
template<typename T> /// common it call T

void Print(T value) {
  std::cout << value << std::endl;
}

/**
 * That is the same like this
 * void Print(int value) {
 *  std::cout << value << std::endl;
 * }
 * 
 * void Print(std::string value) {
 *  std::cout << value << std::endl
 * }
 * 
 * void Print(float value) {
 *  std::cout << value << std::endl;
 * }
*/

int main() {
  Print<int>(2);  /// it put in brckets the type to specify the type
  Print<std::string>("hello");
  Print<float>(2.5f);

  return 0;
}