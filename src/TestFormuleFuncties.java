public class TestFormuleFuncties {

    public static void main(String[] args) {
        String formule = "4*19+13-2";
        System.out.println("Formule testen: "+formule);
        System.out.println("*");
        System.out.println(FormuleBerekenen.getSmallFormula(formule, '*'));

        System.out.println("-");
        System.out.println(FormuleBerekenen.getSmallFormula(formule, '-'));

        System.out.println("+");
        System.out.println(FormuleBerekenen.getSmallFormula(formule, '+'));

        System.out.println(" Is operator");
        System.out.println("*"+FormuleBerekenen.isOperator('*'));
        System.out.println("@"+FormuleBerekenen.isOperator('@'));
    }
}
