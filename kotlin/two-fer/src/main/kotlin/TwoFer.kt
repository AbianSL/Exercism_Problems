fun twofer(name: String): String {
  var phrase: String;
  if (name != "") {
    phrase = "One for $name, one for me."
  } else {
    phrase = "One for you, one for me." 
  }
  return phrase
}
