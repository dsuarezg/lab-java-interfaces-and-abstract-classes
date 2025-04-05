package Task4;


public class IntVector implements IntList{
    private static final int INITIAL_CAPACITY = 20;
    private static int maxCapacity = INITIAL_CAPACITY;

    int[] vector = new int[maxCapacity];
    int[] vectorExtended;

    @Override
    public void add(int number) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) {
                vector[i] = number;
                return;
            }
        }
        maxCapacity=maxCapacity*2;
        vectorExtended = new int[maxCapacity];
        System.arraycopy(vector, 0, vectorExtended, 0, vector.length);
        vector=vectorExtended;
        add(number);

    }

    @Override
    public int get(int id) {
        return vector[id];
    }
}
