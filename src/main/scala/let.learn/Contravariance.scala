package let.learn

/**
  * Created by Bitwise on 7/1/2019.
  */

trait Passenger


class Business extends Passenger

class Corprate extends Business

class AirLine[-T]

object Contravariance {

  def doPayment(method:AirLine[Corprate]){
    print(method)
  }

  doPayment(new AirLine[Business])// pass supertype to subtype

}
