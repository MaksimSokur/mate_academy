import java.util.ArrayList;
import java.util.List;

public class ListFilter {
  //write your method here
    public List<Person> filter(List<Person> allPersonList) {
        List<Person> maleFilter = new ArrayList<>();
        int newListIndex = 0;
        if (allPersonList == null) {
            return List.of();
        }
        for (int i = 0; i < allPersonList.size(); i++) {
            if (allPersonList.get(i).getAge() >= 18
                    && allPersonList.get(i).getAge() <= 27
                    && allPersonList.get(i).getSex().equals("male")){
                maleFilter.add(newListIndex, allPersonList.get(i));
                newListIndex++;
            }
            if (newListIndex == 0) {
                return List.of();
            }
        }
        return maleFilter;
    }
}
