package com.github.soumyakole.oop.rationalmath

object RationalMain extends App {

  val r1 = Rational(2,3)
  val r2 = Rational(2,3)
  val r3 = Rational(2)

  println(r1*r2)
  println(r1 / r2)

  println(r1 + 2)
  println(2 + r1)

  println(r1 <= r2)

  val chk: String = r2 match {
    case Rational(2,4)=> "two by three"
    case _ => "other"
  }

  println(chk)

}
