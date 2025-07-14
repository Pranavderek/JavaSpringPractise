package Set;

import java.util.HashSet;

public class Creating_set
{
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>(); // initialising a hash set

        set.add(100);
        set.add(300);
        set.add(400);

        System.out.println("The Elements of the set are : " +set);
        // Set doesn't have any indexing options, so it will print the values without any specific order

    }
}
