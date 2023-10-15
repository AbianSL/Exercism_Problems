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

function list_score(score) {
  result = ""
  value = 128
  score %= 256 
  for (;value > 0; value /= 2) {
    if (score >= value) {
      result = allergent_name(value) "," result 
      score = score - value
    }
  }
  
  sub(/,$/, "", result)

  return result
}

function indexOf(arr, val) {
  for (idx in arr)
    if (arr[idx] == val)
      return idx
  return ""
}

function allergent_name(score) {
  return indexOf(allergens, score)
}

function in_list(score, allergent) {
  split(list_score(score), list, ",")
  return indexOf(list, allergent) != "" ? 1 : 0
}

function allergic_to(score, allergent) {
  return in_list(score, allergent) ? "true": "false"
}
