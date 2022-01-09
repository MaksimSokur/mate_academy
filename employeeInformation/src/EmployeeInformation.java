import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeInformation {
  public List<Employee> getEmployeesByCityAndYearOfBirth(
    Map<Employee, String> employeesInformation, int yearOfBirth, String city) {
    //write your code here
    List<Employee> newEmployee = new ArrayList<>();
    for (Map.Entry<Employee, String> employee : employeesInformation.entrySet()) {
      if (employee.getKey().getYearOfBirth() >= yearOfBirth && employee.getValue().equals(city)) {
        newEmployee.add(employee.getKey());
      }
    }
    return newEmployee;
  }
}
