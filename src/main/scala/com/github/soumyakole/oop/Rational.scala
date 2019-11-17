package com.github.soumyakole.oop

class Rational(private val n: Int, private val d: Int) extends Ordered[Rational]{
  require(d != 0)

  // auxiliary constructor. This can be achieved through default value of d = 1 in primary constructor
  def this(n: Int) = this(n, 1)

  def + (that: Rational):Rational = new Rational(
    n * that.d + that.n * d,
    d * that.d
  )

  def - (that: Rational):Rational = new Rational(
    n * that.d - that.n * d,
    d * that.d
  )

  def * (that: Rational): Rational =
    new Rational(n * that.n, d * that.d)

  def / (that: Rational): Rational =
    new Rational(n * that.d, d * that.n)


  override def toString = {
    val g = gcd(n.abs, d.abs)
    val numer = n / g
    val demnom = d / g
    if (demnom !=1) numer + "/" + demnom else numer.toString
  }

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  override def compare(that: Rational): Int = this.n * that.n - this.d * that.n
}

object Rational {
  def unapply(rational: Rational): Option[(Int, Int)] = if (rational.d == 0) None else Some((rational.n,rational.d))

  def apply(n: Int, d: Int = 1): Rational = new Rational(n,d)
}

