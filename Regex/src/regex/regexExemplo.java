package regex;

import java.awt.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExemplo {
	

public static void main(String[] args) {
	int soma = 0;
	Scanner read = new Scanner(System.in);
	StringBuffer string = new StringBuffer();
	String str = read.nextLine();
	  Pattern p = Pattern.compile("[0-9]+");
	  Matcher m = p.matcher(str);
	  while (m.find()) {
	   string.append(m.group());
	   int x = Integer.parseInt((m.group()));
	   soma += x;
	   //System.out.println(x);
	  read.close();
	  }
	  //System.out.println(string.toString());
	  System.out.println(soma);
	 
}
}