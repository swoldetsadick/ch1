package introscala

object Upper1 {
  def main(args: Array[String]): Unit = {
    args.map(_.toUpperCase()).foreach(printf("%s ", _))
    println("")
  }
}
