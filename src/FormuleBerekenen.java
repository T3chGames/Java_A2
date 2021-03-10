import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FormuleBerekenen {
    static Integer bereken(String formule) {


        //hier kijkt hij of de formule voldoet aan de eisen doormiddel van een pattern.


        final Pattern pattern = Pattern.compile("(\\d+)([\\*\\+-])(\\d+)");
        final Matcher matcher = pattern.matcher(formule);


        //als de formule voldoet dan kijkt hij wat voor soort formule het is dus * + of - .




        if (matcher.matches()) {
            switch (matcher.group(2)) {
                case "*":
                    return Integer.parseInt(matcher.group(1)) * Integer.parseInt(matcher.group(3));
                case "+":
                    return Integer.parseInt(matcher.group(1)) + Integer.parseInt(matcher.group(3));
                case "-":
                    return Integer.parseInt(matcher.group(1)) - Integer.parseInt(matcher.group(3));
            }
            return 1;


            //als dat niet het geval is kijkt hij hier of er haakjes in de formule staan en returnt hij
            // het daarna weer aan formule berken.


        } else if (formule.matches(".*\\(.+\\).*")) {
            final int begin = formule.lastIndexOf('(');
            final int end = formule.indexOf(')', begin);
            int subresult = bereken(formule.substring(begin + 1, end));
            String newformule = formule.substring(0, begin) + subresult + formule.substring(end + 1);
            return bereken(newformule);


        //als er in de formule meerdere operators staan gaat de formule naar dit stukje code.



        } else  {
            for(char chars : formule.toCharArray())

            {

            }
        }

       return 0;
    }
}
