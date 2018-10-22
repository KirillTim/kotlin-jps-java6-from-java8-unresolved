fun main(args: Array<String>) {
  val file = Java6Class.createFile()
  val path = file.toPath()
  println(file)
  println(path)
}