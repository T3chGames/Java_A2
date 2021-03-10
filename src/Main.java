public class Main {

    static FormuleBerekenen fBerkenen = new FormuleBerekenen();
    static Getalherken gHerken = new Getalherken();
    static brackets bracket = new brackets();

    public static void main(String[] args) {

        //dit zijn de formules die hij uit gaat rekenen
        String formule = "4*3";
        Integer resultaat = fBerkenen.bereken(formule);
        System.out.println(formule + " = " + resultaat);


        formule = "(3+4)*3";
        resultaat = fBerkenen.bereken(formule);
        System.out.println(formule + " = " + resultaat);

        formule = "10-4-2";
        resultaat = fBerkenen.bereken(formule);
        System.out.println(formule + " = " + resultaat);


    }

}







