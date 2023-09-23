BEGIN {
  FS = ","
}

{ 
  if ($2 == "allergic_to") {
    allergic_to($1, $3)
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
  if (substract >= 0 && (substract > value || substract == 0)) {
    print("true")
  } else {
    print("false")
  }
}


