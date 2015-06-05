import java.util.*;

public class ListUtilsImpl implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        List<String> asList = new LinkedList<>();
        for (String s: strings){
            asList.add(s);
        }
        return asList;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {

        LinkedList<Double> sortList = new LinkedList<Double>();

        sortList.addAll(data);

        Collections.sort(sortList);
        Collections.reverse(sortList);

        return sortList;
    }
}
