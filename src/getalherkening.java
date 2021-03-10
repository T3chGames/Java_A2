import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Getalherken  {
    //hier kijkt het programma of de formule uit alleen cijfers, operators en haakjes bestaat.
    static String clean(String dirty) {
        final StringBuffer output = new StringBuffer();
        final Set<Character> allowed = Set.of('0','1','2','3','4','5','6','7','8','9','(',')','*','+','-');
        for (int c =0; c < dirty.length(); c++) {
            if (allowed.contains(dirty.charAt(c))) {
                output.append(dirty.charAt(c));
            }
        }
        return output.toString();
    }

}

