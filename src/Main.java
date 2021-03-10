public class Main {

    static FormuleBerekenen fBerkenen = new FormuleBerekenen();
    static Getalherken gHerken = new Getalherken();
    static brackets bracket = new brackets();

    public static void main(String[] args) {

        String[] formules = {"4+1", "4*3", "(4+2)*5", "1+1+1"};
        for (int i = 0; i < formules.length; i++) {
           report(formules[i]);
        }

    }

    private static void report(String formule) {
        int resultaat = fBerkenen.bereken(formule);
        System.out.println(formule + " = " + resultaat);
    }

}







