package let.learn

import java.io.File


trait FileOps {
  self: File =>

  def isTextFile():Boolean = this.getName.endsWith("txt")
}

trait T
case object F extends T

object test{


  def main(args: Array[String]): Unit = {

    val file=new File("data.txt") with FileOps
    List(1,2)
    println(file.exists())
    println(file.isTextFile())

  }
}