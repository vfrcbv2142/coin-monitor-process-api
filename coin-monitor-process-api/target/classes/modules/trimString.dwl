import substring from dw::core::Strings
fun trimStringOfDigits(number: String, digitsAfterComa: Number) = do {
  var result = 
    if (number == "null")
      "null"
    else
      (number splitBy("."))[0] ++ "." ++ substring(((number splitBy("."))[1]), 0, digitsAfterComa)
  ---
  result
}