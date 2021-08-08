/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Lenovo
 */
public class Emailvalidator {
    
    
   /* private Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_PATTERN="[_A-za-z0-9\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public   Emailvalidator()
    {
        pattern=Pattern.compile(EMAIL_PATTERN);
       // return (pattern);
    }
    public boolean validate(final String hex){
        matcher=pattern.matcher(hex);
        return matcher.matches();
    }*/
    
    
public static void main(String args[])

{
	//patChecker("abc");

}


public static boolean patChecker(String s)

{
Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);


       
 Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(s);
        if(matcher.find())
        {
        	System.out.println("Valid");
        }
 
       else
        {
        	System.out.println("InValid");       
	}
return(true);
}

}


