BEGIN {
  allergens["eggs"] = 1
  allergens["peanuts"] = 2
  allergens["shellfish"] = 4
  allergens["strawberries"] = 8
  allergens["tomatoes"] = 16
  allergens["chocolate"] = 32
  allergens["pollen"] = 64
  allergens["cats"] = 128

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
    if (score >= value) {
      result = allergent_name(value) "," result 
      score = score - value
    }
    value = value / 2
  }
  
  sub(/,$/, "", result)

  return result
}

function allergent_name(score) {
  for (allergent in allergens) {
    if (allergens[allergent] == score) {
      return allergent
    }
  }
  return ""
}

function in_list(score, allergent) {
  split(list_score(score), list, ",")
  founded = 0
  for (i in list) {
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
