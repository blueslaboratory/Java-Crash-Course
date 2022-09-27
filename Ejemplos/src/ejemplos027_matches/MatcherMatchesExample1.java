package ejemplos027_matches;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMatchesExample1 {  
  
    public static void main(String[] args) {  
        Pattern p = Pattern.compile(".*http://.*", Pattern.CASE_INSENSITIVE);  
        //precedido o seguido por cualquier cosa
        
        Matcher m = p.matcher("This is URL:Http://localhost");  
        //Matching un patron contra una expresion regular
        boolean matches = m.matches();  
        System.out.println("matches = " + matches);  
    }  
}