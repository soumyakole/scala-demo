package com.github.soumyakole.datastructure

/**
  * Write a loop that swaps adjacent elements of an array of integers.
  * For example, Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5)
  */

object ArraySwap extends App {

  val a = Array(1,2,3,4,5);

  val solution_1 = a.grouped(2).flatMap(_.reverse).toArray

  println(solution_1.mkString(" "))

  val solution_2 = for {b <- a.grouped(2); c <- b.reverse} yield c

  //echo is defined in package object
  datastructure.echo(solution_2.mkString(" "))

}
