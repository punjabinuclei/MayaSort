package mayasort;
import java.util.*;

public class MayaSort
{

    // Function 1: Generates a list of random integers (0–9) of the same size as the input list.
    public List<Integer> shizoOne(List<Integer> originalList) {
        List<Integer> shizoList = new ArrayList<>();
        for (int i = 0; i < originalList.size(); i++) {
            int randomInt = (int) (Math.random() * 10); // Generate random integer between 0–9
            shizoList.add(randomInt);
        }
        return shizoList;
    }

    // Function 2: Returns a humorous message.
    public String shizoTwo(List<Integer> originalList) {
        return "Bruh, what was I even doing? This code's got me feeling like I'm in a loop...";
    }

    // Function 3: Sorts the list in descending order and multiplies each element by -17.
    public List<Integer> shizoThree(List<Integer> originalList) {
        List<Integer> shizoList = new ArrayList<>();
        // Sort the input list in reverse order
        Collections.sort(originalList, Collections.reverseOrder());

        // Multiply each element by -17 and add to the new list
        for (int x : originalList) {
            shizoList.add(-17 * x);
        }

        return shizoList;
    }



    public static void main(String[] args) {
        // Create a test list
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Create an instance of ShizoSort
        MayaSort sorter = new MayaSort();

        // Call shizoThree and store the result
        List<Integer> shizoList = sorter.shizoThree(list);

        // Print the sorted and modified list
        for (int x : shizoList) {
            System.out.println(x);
        }
    }
}