public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) {
    String result = "";
    text = text.replace("\n", "~\n~");
    String[] lines = text.trim().split( "\n" );

    String comments = "";
    for(int i = 0; i < commentSymbols.length; i++) { comments += commentSymbols[i]; }

    for ( String line : lines ) {
      
      for( int index = 0; index < line.length(); index++ ) {
          String currentChar = ""+line.charAt(index);

          if( comments.contains(currentChar) ) { break; }
          else { result += currentChar; }
      }

      result = result.replace("~", "");
      if( !line.isBlank() ) result = result.replaceAll("\\s++$","");
      result += "]";
      result += "\n";
    }

    return result.substring(0, result.length() - 1);
  }	
  
  public static void main(String[] args) {
    System.out.println();
    System.out.println( "Expected:<\napples, pears]\n]\ngrapes]\nbananas]>\n\nRecieived:<\n" +
    StripComments.stripComments( "apples, pears # and bananas\n\ngrapes\nbananas !apples", new String[] { "#", "!" } ) + ">");
    System.out.println();
    System.out.println();

    // System.out.println( "Expected:\na\nc\nd\nReceived:\n" +
    // StripComments.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } ));
    // System.out.println();
    // System.out.println();

    System.out.println( "Expected:<\n]\na]\n b]\nc]>\n\nReceived:<\n" +
    StripComments.stripComments( "\na\n b \nc", new String[] { "#", "$" } ) + ">");
    System.out.println();
  }
}

/*
  Complete the solution so that it strips all text that follows any of a set of comment markers passed in. Any whitespace at the end of the line should also be stripped out.

  Example:

  Given an input string of:

  apples, pears # and bananas
  grapes
  bananas !apples
  The output expected would be:

  apples, pears
  grapes
  bananas
  The code would be called like so:

  var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
  result should == "apples, pears\ngrapes\nbananas"
*/