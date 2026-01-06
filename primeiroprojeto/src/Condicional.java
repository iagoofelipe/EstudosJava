public class Condicional {
    public static void main(String[] args) {
        int year = 1986;
        boolean inPlan = true;
        String planType = "plus";

        if (year >= 2022) {
            System.out.println("New one enjoyed by clients!");
        } else {
            System.out.println("Old one that worth it!");
        }

        System.out.println(inPlan || planType.equals("plus")? "Movie available to watch" : "Movie not available with your plan");
    }
}
