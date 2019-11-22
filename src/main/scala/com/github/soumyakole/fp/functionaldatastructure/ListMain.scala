package com.github.soumyakole.fp.functionaldatastructure

object ListMain extends App{

  val a = List(1,2,3,4,5)
  println(a.getClass.getName)

  val x = List(1,2,3,4,5) match {
    case Cons(x, Cons(2, Cons(4, _))) => x
    case Nil => 42
    case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
    case Cons(h, t) => h
    case _ => 101
  }

  val b = Test(1,2)


}
