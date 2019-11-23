package com.github.soumyakole.fp.problemsolving

/**
  * Each password must have at least six characters and a mix of upper and lowercase letters.
  * So, given a list of password strings, we need to compute a corresponding list of Booleans that will return true if the password qualifies, and otherwise false.
  */

object PasswordValidation extends App{
  val passwords = List("oddoddboy@thedoor", "likelynew", "alwaysThinkOfMyself", "naughty")

  //Length checker
  def lengthGreaterThan(minLen: Int)(s: String) = s.length >= minLen
  val validatePasswdLen: String => Boolean = lengthGreaterThan(6) _

  //Char checker
  val containsChar: (Char, String) => Boolean = (c: Char, s: String) => s.contains(c)
  def containsOneOf(inChars: Seq[Char])(s: String): Boolean = inChars exists(c => containsChar(c,s))
  val containsUpper: String => Boolean = containsOneOf('A' to 'Z') _
  val containsLower: String => Boolean = containsOneOf('a' to 'z') _

  //Final Check function
  val checker = (pass:String) => validatePasswdLen(pass) && containsLower(pass) && containsUpper(pass)

  //Using map
  val result: Seq[(String, Boolean)] = passwords.map(x => (x, checker(x)))
  println(result)

  //using for
  val result1: Seq[(String, Boolean)] = for (w <- passwords) yield (w,checker(w))
  println(result1)


}
