/**
 * Created by dehaizh on 2017/2/15.
 */
object StringUtilities {
  implicit class StringImprovement(s:String){
    def increment():String =  s.map( ch=>(ch+1).toChar)
    def decrement():String =  s.map( ch=>(ch-1).toChar)
    def hideAll:String = s.replaceAll(".","*")
  }
}
