package Task4;

import java.util.ArrayList;

public class IntArrayList implements IntList{
    private static final int INITIAL_CAPACITY = 10;
    private static int maxCapacity = INITIAL_CAPACITY;

    ArrayList<Integer> list = new ArrayList<>(maxCapacity);
    ArrayList<Integer> listExtended;

    @Override
    public void add(int number) {
        if (list.size() < maxCapacity) {
            list.add(number);
        } else {
            maxCapacity=list.size()+(list.size())/2;
            listExtended = new ArrayList<>(maxCapacity);
            listExtended.addAll(list);
            listExtended.add(number);
            list=listExtended;
        }

    }

    @Override
    public int get(int id) {
        return list.get(id);
    }
}
