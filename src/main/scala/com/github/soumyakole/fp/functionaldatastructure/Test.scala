package com.github.soumyakole.fp.functionaldatastructure

class Test(val x: Int, val y:Int) {

}

object Test{
  def apply(x: Int, y: Int): Test = new Test(x, y)
  def sum(t: Test) = t.x + t.y
}
