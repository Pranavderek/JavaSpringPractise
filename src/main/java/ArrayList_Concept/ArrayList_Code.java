package ArrayList_Concept;

import java.util.*;

public class ArrayList_Code
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>(); // This is how we declare the collection framework
        // to add elements to the list we use this special methode called add()
        nums.add(10);
        nums.add(20);
        nums.add(30);

        // nums.size() methode helps to het the total number of elements in the list
        for (int num : nums) {
            System.out.println(num); // nums.get allow us to print the values of the nums list
        }
        System.out.println(nums.indexOf(20)); // this methode helps us to print the index value of the el

        // adding element at a particular index is :
        nums.add(2,200);
        System.out.println(nums);  // output will be reelected as [10, 20, 200, 30]

        // getting the element from the index is :
        int num = nums.get(1); // getting the value from the index value and storing it in a variable
        System.out.println(num); // output is : 20

        // setting a new value of an index is :
        System.out.println("Before set Methode: "+nums);
        nums.set(3,20); // 3 is the index value and 20 is the value we want to update\
        System.out.println("used set methode: "+nums);

        // removing the element from an index is:
        nums.remove(3); // this methode helps to remove the element from the index
        System.out.println("After removing the elements from the arraylist: "+nums);

        // to get the size of the array list
        System.out.println("The length of the array is : "+nums.size());

        // to get the index of the element is :
        int index = nums.indexOf(20);
        System.out.println("The Index if the element is : "+index);

    }
}