#include <iostream>
#include <string>

/**
 * The style google of c++ say that the templates (typename) should use only if it will do the code more clearly and safer
 * but, if it only of the inconvenience of wreinting an explicit type
 * 
 * On the other hand, templates (class) are be use only if the team is agree or the maintainers have opted into supporting it.
 * on other case it will be not use.  
 */

/// temaplate is for only use one function instead two or more function
template <typename T> /// common it call T

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

template <typename R,int N>
class Array {
 public:
  int GetSize() const { return N; }
 private:
  R m_Array_[N];
};

int main() {
  Print<int>(2);  /// it put in brckets the type to specify the type
  Print<std::string>("hello");
  Print<float>(2.5f);

  /// Template class
  Array<std::string, 5> array;
  std::cout << array.GetSize() << std::endl;

  return 0;
}