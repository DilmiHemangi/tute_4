object  Q2 extends App{
    def isEven_Odd(x:Int):String=x match{
        case x if x<=0=>"Negative/Zero"
        case x if x%2==0=>"Even"
        case x if x%2==1=>"Odd"
    }
    println("Number is "+isEven_Odd(12))
}