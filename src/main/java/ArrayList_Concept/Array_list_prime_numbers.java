package ArrayList_Concept;

import java.util.ArrayList;

public class Array_list_prime_numbers
{
    public static void main(String[] args) {

        ArrayList<Integer> prime = new ArrayList<>();
        for(int i=1;i<=100;i++)
        {
            int count = 0;
            for(int j=1;j<=i;j++)
            {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if(count == 2)
            {
                prime.add(i);
            }
        }
        System.out.println("Printing all the prime numbers of the program is: "+prime);
    }
}
