package let.learn

trait Func[-T,+R]{
  def call(p:T):R
}

class Add extends Func[Int,String] {
  override def call(p: Int): String =
    p.toString
}
object Add{
  def apply: Add = new Add()
}
object Variance {
  val p:Number=30

  new Add().call(1)

}
