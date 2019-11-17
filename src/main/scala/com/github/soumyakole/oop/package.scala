package com.github.soumyakole

package object oop {
  implicit def intToRational(x: Int) = new Rational(x)
}
