package SorteOpgaver.ch11.aske1208_a_11_2;

import java.util.ArrayList;
import java.util.List;

public class two
{
    public List<String> alternate(List<String> list1, List<String> list2)
    {
        int shortestList;
        List<String> longestList = new ArrayList<>();

        if (list1.size() > list2.size())
        {
            shortestList = list2.size();
            longestList = list1;

        }else{
            shortestList = list1.size();
            longestList = list2;
        }

        List<String> alternatedList = new ArrayList<String>();


        for (int i = 0; i < shortestList; i++)
        {
            alternatedList.add(list1.get(i));
            alternatedList.add(list2.get(i));
        }

        for (int i = shortestList; i < longestList.size(); i++)
        {
            alternatedList.add(longestList.get(i));
        }

        return alternatedList;
    }
}
