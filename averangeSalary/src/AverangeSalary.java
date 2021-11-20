public class AverangeSalary {
    public double getAverageSalary(double[] salaries) {
        // write your code here
        if (salaries.length == 0){
            return 0;
        }
        double averangeSalary = 0;
        for (int i = 0; i < salaries.length; i++) {
            averangeSalary += salaries[i];
        }
        averangeSalary = averangeSalary/(salaries.length);
        return averangeSalary;
    }

    public static void main(String[] args) {
        double[] salary = {0};
        AverangeSalary salary1 = new AverangeSalary();

        System.out.println(salary1.getAverageSalary(salary));

    }
}
