/**
 * Created by dehaizh on 2017/2/10.
 */
class Rational(n:Int, d:Int){
  require( d!=0 )
  private val g = gcd(n.abs,d.abs)
  val num:Int = n/g
  val deno:Int = d/g

  override def toString: String = num+" / "+deno
  def this(fir:Int) = this(fir,1)

  def +(that:Rational):Rational= new Rational(num*that.deno+that.num*deno,deno*that.deno)

  private def gcd(a:Int, b:Int):Int = if(b==0) return a else return gcd(b,a%b)

}
