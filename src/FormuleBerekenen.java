import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FormuleBerekenen {

    static char[] operators = {'*', '+', '-'};

    static Integer bereken(String formule) {


        //hier kijkt hij of de formule voldoet aan de eisen doormiddel van een pattern.


        final Pattern pattern = Pattern.compile("(\\d+)([\\*\\+-])(\\d+)");
        final Matcher matcher = pattern.matcher(formule);


        //als de formule voldoet dan kijkt hij wat voor soort formule het is dus * + of - .
        int resultaat = 0;

        if (matcher.matches()) {

            switch (matcher.group(2)) {
                case "*":
                    resultaat = Integer.parseInt(matcher.group(1)) * Integer.parseInt(matcher.group(3));
                    break;
                case "+":
                    resultaat =  Integer.parseInt(matcher.group(1)) + Integer.parseInt(matcher.group(3));
                    break;
                case "-":
                    resultaat = Integer.parseInt(matcher.group(1)) - Integer.parseInt(matcher.group(3));
                    break;
            }

            //als dat niet het geval is kijkt hij hier of er haakjes in de formule staan en returnt hij
            // het daarna weer aan formule berken.


        } else if (formule.matches(".*\\(.+\\).*")) {
            final int begin = formule.lastIndexOf('(');
            final int end = formule.indexOf(')', begin);
            int subresult = bereken(formule.substring(begin + 1, end));
            String newformule = formule.substring(0, begin) + subresult + formule.substring(end + 1);
            resultaat = bereken(newformule);


            //als er in de formule meerdere operators staan gaat de formule naar dit stukje code.


        } else {


            for (int i = 0; i < operators.length; i++) {
                while (hasOperator(formule, operators[i])) {
                    String sub = getSmallFormula(formule, operators[i]);
                    int getal = bereken(sub);

                }
            }
        }

        return resultaat;
    }

    private static boolean hasOperator(String formule, char operator) {
        boolean result = false;
        for (int i=0; i<operators.length; i++) {
            if (formule.indexOf(operator)>-1)
                result = true;
        }
        return result;
    }

    public static String getSmallFormula(String formule, char op) {
        int p = formule.indexOf(op);
        int begin = p - 1;
        int eind = p + 1;
        while ((begin > 0) && (!isOperator(formule.charAt(begin)))) {
            begin--;
        };

        if (isOperator(formule.charAt(begin))) {
            begin++;
        }

        do {
            eind++;
        } while ((eind < formule.length()) && (!isOperator(formule.charAt(eind))));
        return formule.substring(begin, eind);
    }

    public static boolean isOperator(char charAt) {
        boolean result = false;
        for (int i = 0; i < operators.length; i++)
            if (charAt == operators[i])
                result = true;
        return result;
    }
}
