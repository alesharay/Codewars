// Simple, remove the spaces from the string, then return the resultant string.

fun main() {
  print( "Expected: 8j8mBliB8gimjB8B8jlB; Received: ${noSpace("8 j 8   mBliB8g  imjB8B8  jl  B")}\n" )
  print( "Expected: 88Bifk8hB8BB8BBBB888chl8BhBfd; Received: ${noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd")}\n" )
  print( "Expected: 8aaaaaddddr; Received: ${noSpace("8aaaaa dddd r     ")}\n" )
}

fun noSpace(x: String): String {
  //var newX = x.replace("\\s".toRegex(), "")
  return x.replace(" ", "")
}

/*
TESTS
    assertEquals("8j8mBliB8gimjB8B8jlB", noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"))
    assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"))
    assertEquals("8aaaaaddddr", noSpace("8aaaaa dddd r     "))
*/