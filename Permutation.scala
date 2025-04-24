def permute(str: String, result: String): Unit = {
    if (str.isEmpty) {
      println(result)  // Print the result when no characters are left
    } else {
      for (i <- 0 until str.length) {
        // Choose the current character and recursively permute the rest
        permute(str.take(i) + str.drop(i + 1), result + str(i))
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val input = "abc"  // Input string
    permute(input, "") // Call the permute function
  }
}
