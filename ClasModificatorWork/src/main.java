public class main {
    public static void main(String[] args) {

        class Student {
            String statistic;

            public double getSuccessRate(String statistic) {
                // write your code here
                char[] rateArray = statistic.toCharArray();
                int confirm = 0;
                boolean isEmpty = statistic.isEmpty();
                if (statistic.isEmpty() == true){
                    return 0;
                }
                for (int i = 0; i < rateArray.length; ++i){
                    if(isEmpty == true){
                        return 0;
                    }else if(rateArray[i] == '1'){
                        ++confirm;
                    }

                }
                double percentOfStudents = 0;
                percentOfStudents = (double) confirm / (rateArray.length);
                return percentOfStudents;
            }
        }

        Student student1 = new Student();
        student1.statistic = "010001110101";
        System.out.println(student1.getSuccessRate(""));

    }
}
