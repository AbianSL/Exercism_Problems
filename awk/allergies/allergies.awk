BEGIN {
  FS = ","
}

{ 
  if ($2 == "allergic_to") {
    print allergic_to($1, $3)
  } else if ($2 == "list") {
    print list_score($1)
  } 
}

function ignore_high_score(score) {
  while (score > 255) {
    score = score - 256
  }
  return score
}

function list_score(score) {
  result = ""
  value = 128
  score = ignore_high_score(score) 
  while (value > 0) {
    if (score >= value && allergent_name(value) != "") {
      result = allergent_name(value) "," result 
      score = score - value
    }
    value = value / 2
  }
  
  sub(/,$/, "", result)

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
  return ""
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

function in_list(score, allergent) {
  split(list_score(score), list, ",")
  founded = 0
  for (i = 0; i < length(list); i++) {
    if (list[i] == allergent) {
      founded = 1
    }
  }
  return founded
}

function allergic_to(score, allergent) {
  if (in_list(score, allergent) == 1) {
    return "true"
  } else {
    return "false"
  }
}


