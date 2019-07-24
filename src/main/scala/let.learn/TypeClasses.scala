package let.learn


trait Combiner[T]{
  def combine(a:T,b:T):T
}

object implicits{

  implicit val intCombiner : Combiner[Int] =new Combiner[Int] {
    override def combine(a: Int, b: Int) = a+b
  }

  implicit def listCombiner[T]:Combiner[List[T]]=new Combiner[List[T]] {
    override def combine(a: List[T], b: List[T]) = a ++ b
  }

}

object CombinerUtils{

  def combine[T](a:T,b:T)(implicit cv:Combiner[T]): T ={
    cv.combine(a,b)
  }
}

object TypeClasses {

  import CombinerUtils._
  import implicits._

  def main(args: Array[String]): Unit = {

    println(combine(1, 2))
  }
}
