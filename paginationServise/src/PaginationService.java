import java.util.Arrays;

public class PaginationService {
    private String[] data;
    private int elementsPerPage;

    public PaginationService(String[] data, int elementsPerPage) {
        this.data = data;
        this.elementsPerPage = elementsPerPage;
    }
    public int getElementsCount(){
        return data.length;
    }

    public int getPageNumberByElementIndex(int index){
        if (data.length <= 0 || data.length < index || index < 0){return -1;}
        int numberOfPage = 0;
        if (elementsPerPage > index)
        {
           return numberOfPage;
        }
        for (; elementsPerPage < data.length; ) {
            elementsPerPage = elementsPerPage + elementsPerPage;
            numberOfPage++;

        }
        return numberOfPage;
    }


    public static void main(String[] args) {
        String[] strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        PaginationService service = new PaginationService(strings, 8);
        System.out.println(service.getElementsCount());
        System.out.println(service.getPageNumberByElementIndex(30));

    }
}
