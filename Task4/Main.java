package Task4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        IntArrayList intArrayList = new IntArrayList();
        IntVector intVector = new IntVector();


        for(int i=0; i<25; i++) {
            intArrayList.add(random.nextInt(0, 100));
            intVector.add(random.nextInt(0, 100));
        }

        for(int i=0; i<22; i++) {
            System.out.println("IntArrayList: " + (i+1));
            System.out.println(intArrayList.get(i));
            System.out.println("IntVector: " + (i+1));
            System.out.println(intVector.get(i));
        }


    }
}
