package com.github.soumyakole.oop

object RationalMain extends App {

  val r1 = new Rational(2,3)
  val r2 = new Rational(2,3)
  val r3 = new Rational(2)

  println(r1*r2)
  println(r1 / r2)

  println(r1 + 2)

  println(r1 <= r2)

}
