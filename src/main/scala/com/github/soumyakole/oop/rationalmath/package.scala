package com.github.soumyakole.oop

package object rationalmath {
  implicit def intToRational(x: Int) = new Rational(x)
}
