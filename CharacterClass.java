public class CharacterClass {

   public static void main(String args[]) {

	System.out.println("She said \"Hello!\" to me.");

      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
      String helloString = new String(helloArray);  
      System.out.println( helloString );
	
	System.out.println( "String Length code : " );
	String palindrome = "Dot saw I was Tod";
	int len = palindrome.length();
	System.out.println( "String Length is : " + len );
	 
	System.out.println( " Concatenating Strings" );
      String string1 = "saw I was ";
      System.out.println("Dot " + string1 + "Tod");
/*
Creating Format Strings

You have printf() and format() methods to print output with formatted numbers. The String class has an equivalent class method, format(), that returns a String object rather than a PrintStream object.

Using String's static format() method allows you to create a formatted string that you can reuse, as opposed to a one-time print statement. For example, instead of 

String fs;
fs = String.format("The value of the float variable is " +
                   "%f, while the value of the integer " +
                   "variable is %d, and the string " +
                   "is %s", floatVar, intVar, stringVar);
System.out.println(fs);	
*/  
	char ch = 'a';
	System.out.println("ch: " + ch);
	// Unicode for uppercase Greek omega character
	char uniChar = '\u039A'; 
	System.out.println("uniChar: "+ uniChar);
	// an array of chars
	char[] charArray ={ 'a', 'b', 'c', 'd', 'e' }; 
	 System.out.println("charArray position 0: "+ charArray[0]+", position  1: "+ charArray[1] + ", position 2: "+charArray[2]+ ", position 3: "+charArray[3]+ ", position 4: "+charArray[4]);
	 
	System.out.println("\t 	Inserts a tab in the text at this point.");
	System.out.println("\b 	Inserts a backspace in the text at this point.");
	System.out.println("\n 	Inserts a newline in the text at this point.");
	System.out.println("\r 	Inserts a carriage return in the text at this point.");
	System.out.println("\f 	Inserts a form feed in the text at this point.");
	System.out.println("\' 	Inserts a single quote character in the text at this point.");
	System.out.println("\" 	Inserts a double quote character in the text at this point.");
	System.out.println("\\ 	Inserts a backslash character in the text at this point.");
	
	//1 	isLetter() -Determines whether the specified char value is a letter.
	System.out.println("isLetter: " + Character.isLetter('c'));
	System.out.println("isLetter: " + Character.isLetter('5'));
	//2 	isDigit() - Determines whether the specified char value is a digit.
	System.out.println("isDigit: " + Character.isDigit('c'));
	System.out.println("isDigit: " + Character.isDigit('5'));
	//3 	isWhitespace() - Determines whether the specified char value is white space.
	System.out.println("isWhitespace: " + Character.isWhitespace('c'));
	System.out.println("isWhitespace: " + Character.isWhitespace(' '));
	System.out.println("isWhitespace: " + Character.isWhitespace('\n'));
	System.out.println("isWhitespace: " + Character.isWhitespace('\t'));
	//4 	isUpperCase() - Determines whether the specified char value is uppercase.
      System.out.println("isUpperCase: " + Character.isUpperCase('c'));
      System.out.println("isUpperCase: " + Character.isUpperCase('C'));
      System.out.println("isUpperCase: " + Character.isUpperCase('\n'));
      System.out.println("isUpperCase: " + Character.isUpperCase('\t'));	
	//5 	isLowerCase() -Determines whether the specified char value is lowercase.
      System.out.println("isLowerCase: " + Character.isLowerCase('c'));
      System.out.println("isLowerCase: " + Character.isLowerCase('C'));
      System.out.println("isLowerCase: " + Character.isLowerCase('\n'));
      System.out.println("isLowerCase: " + Character.isLowerCase('\t'));	
	//6 	toUpperCase() - Returns the uppercase form of the specified char value.
      System.out.println("toUpperCase: " + Character.toUpperCase('c'));
      System.out.println("toUpperCase: " + Character.toUpperCase('C'));	
	//7 	toLowerCase() - Returns the lowercase form of the specified char value.
      System.out.println("toLowerCase: " + Character.toLowerCase( 'c'));
      System.out.println("toLowerCase: " + Character.toLowerCase('C'));	
	//8 	toString() - Returns a String object representing the specified character value that is, a one-character string.
      System.out.println("toString: " + Character.toString( 'c'));
      System.out.println("toString: " + Character.toString('C'));	
	  
	  //-------------------
      String s = "Strings are immutable";
      char result1 = s.charAt(8);
      System.out.println("charAt give char at location: "+ result1);	  

	//-----------------------
      String str1 = "Strings are immutable";
      String str2 = new String("Strings are immutable");
      String str3 = new String("Integers are not immutable");
      
      int result2 = str1.compareTo( str2 );
      System.out.println("String compareTo() Method: " + result2);
      
      result2 = str2.compareTo( str3 );
      System.out.println("String compareTo() Method: " + result2);	  
	  
	  //-------------------
      String str01 = "Strings are immutable";
      String str02 = "Strings are immutable";
      String str03 = "Integers are not immutable";
      
      int result = str01.compareTo( str02 );
      System.out.println(result);
      
      result = str02.compareTo( str03 );
      System.out.println(result);
      
      result = str03.compareTo( str01 );
      System.out.println(result);	  
   }
}