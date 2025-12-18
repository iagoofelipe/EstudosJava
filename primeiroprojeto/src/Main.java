//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int year = 2022;
        boolean inPlan = true;
        double
            score = 8.1,
            average = (9.8 + 7.5 + 8.2) / 3;
        String title = "Harry Potter and The Chamber of Secrets";

        // using format to the message
        String formatted1 = String.format("""
                It's the Screen Match
                
                Title: %s
                Score: %.2f
                Average: %.2f
                Year of release: %d
                """, title, score, average, year);

        // or
        String formatted2 = """
                It's the Screen Match
                
                Title: %s
                Score: %.2f
                Average: %.2f
                Year of release: %d
                """.formatted(title, score, average, year);



        if (inPlan) {
            // System.out.println("It's the Screen Match");
            // System.out.println("Title: " + title);
            // System.out.println("Score: " + score);
            // System.out.println("Average: " + average);
            // System.out.println("Year of release: " + year);
            System.out.println(formatted2);
        } else {
            System.out.println("This movie is out of your plan");
        }

    }
}