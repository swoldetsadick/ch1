class Upper {
    def upper(strings: String*): Seq[String] = {
        strings.map((s: String) => s.toUpperCase())
    }
}

val up = new Upper
println(up.upper(strings = "Hello", "World!", "123", "aaa"))
