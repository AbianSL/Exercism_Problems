# These variables are initialized on the command line (using '-v'):
# - num

BEGIN {
  result = ""
  if (num % 3 == 0) {
    result = "Pling"
  } else if (num % 5 == 0) {
    result = result + "Plang"
  } else if(num % 7 == 0) {
    result = result + "Plong"
  } else {
    result = num
  }
  print result
}
