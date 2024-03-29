package let.learn


trait Bank

trait Online extends Bank
trait Offline extends Bank

class NetBanking extends Online
class Wallet extends Online

class Cash extends Offline
class Cheque extends Offline

class Payment[+T]

object Covariance {

  def doPayment(method:Payment[Online]){
    print(method)
  }

  doPayment(new Payment[NetBanking]) // pass subtype to supertype
}
