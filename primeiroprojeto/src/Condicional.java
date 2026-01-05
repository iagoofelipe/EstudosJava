public class Condicional {
    static void main() {
        int year = 2022;
        boolean inPlan = false;
        double score = 8.1;
        String typePlan = "normal";

        if(year >= 2025) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Retrô que vale a pena assistir!");
        }

        System.out.println(inPlan || typePlan.equals("plus")? "Filme liberado" : "Deve pagar a locação");
    }
}
