package introscala

object Upper2 {
  def main(args: Array[String]): Unit = {
    val output = args.map(_.toUpperCase()).mkString(" ")
    println(output)
  }
}
