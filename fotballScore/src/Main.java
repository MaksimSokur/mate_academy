public class Main {
    public static void main(String[] args) {
        String[] plans = {"wake up", "have breakfast", "go to work", "solve 5 tasks from codewars"};
        System.out.println(createDailyPlan(plans));
    }

    public static String createDailyPlan(String[] plans) {
        //Write code below this line
        String string1 = "My plans:\n";
        StringBuilder myPlans = new StringBuilder(string1);
        int i = 1;
        for (String string : plans) {
            myPlans.append(i).append(".) ").append(string).append(';').append("\n");
            i++;
        }
        return myPlans.deleteCharAt(myPlans.length() - 1).toString();
        //Write code above this line
    }
}
