BEGIN {
  FS = ","
}

{ 
  if ($2 == "allergic_to") {
    allergic_to($1, $3)
  }
}

function list_score(score) {
  result = ""
  value = 128
  while (value > 0) {
    if (score >= value) {
      result = result "," allergent_name(value)
      score = score - value
    }
    value = value / 2
  }

  return result
}

function allergent_name(score) {
  if (score == 1) {
    return "eggs"
  } else if (score == 2) {
    return "peanuts"
  } else if (score == 4) {
    return "shellfish"
  } else if (score == 8) {
    return "strawberries"
  } else if (score == 16) {
    return "tomatoes"
  } else if (score == 32) {
    return "chocolate"
  } else if (score == 64) {
    return "pollen"
  } else if (score == 128) {
    return "cats"
  }
}

function allergent_score(allergent) {
  if (allergent == "eggs") {
    return 1
  } else if (allergent == "peanuts") {
    return 2
  } else if (allergent == "shellfish") {
    return 4
  } else if (allergent == "strawberries") {
    return 8
  } else if (allergent == "tomatoes") {
    return 16
  } else if (allergent == "chocolate") {
    return 32
  } else if (allergent == "pollen") {
    return 64
  } else if (allergent == "cats") {
    return 128
  }
  return -1 
}

function allergic_to(score, allergent) {
  value = allergent_score(allergent)
  substract = score - value 
  if (substract >= 0 && 
      (substract > value || substract == 0) && 
      (2 * value < score || value == score)) {
    print("true")
  } else {
    print("false")
  }
}


