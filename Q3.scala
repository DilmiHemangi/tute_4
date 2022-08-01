object  Q3 extends App{
    def toUpper(s: String): String = {
   s.toUpperCase()
 }

 def toLower(s: String): String = {
   s.toLowerCase()
 }

 def format_name(name: String)(func: String => String): String = {
    func(name)
 }

 println(format_name("Benny")(toUpper(_)))
 println(format_name("Niroshan".substring(0,2))(toUpper(_))+format_name("Niroshan".substring(2))(toLower(_)))
 println(format_name("Saman")(toLower(_)))
 println(format_name("Kumara".substring(0,1))(toUpper(_))+format_name("Kumara".substring(1,5))(toLower(_))+format_name("Kumara".substring(5))(toUpper(_)))
}