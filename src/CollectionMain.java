import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionMain {

    public static void main (String... args) {

        ArrayList<Integer> arrListOne = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            arrListOne.add(i);
        }


        ArrayList<Integer> arrListTwo = new ArrayList<Integer>();
        int[] simplArr = {-3,2,-3,-1,5,65,5,1,2};
        for (int i = 0; i < simplArr.length; i++) {
            arrListTwo.add(simplArr[i]);
        }

        System.out.print("My Collection One: ");
        for (Integer el: arrListOne) {
            System.out.print(el+ " ");
        }
        System.out.print("\nMy Collection Two: ");
        for (Integer el: arrListTwo) {
            System.out.print(el+ " ");
        }

        String strings = "qwerty asdfg zxcv";
        LinkedList<Double> myDouble = new LinkedList<>();
        double[] doub = {2.2323,1.32,19.45,13.88};
        for (int i = 0; i < doub.length;i++){
            myDouble.add(doub[i]);
        }


        CollectionUtilsImpl myColl = new CollectionUtilsImpl();
        ListUtilsImpl myList = new ListUtilsImpl();



        System.out.println("\nUnion collection: " + myColl.union(arrListOne, arrListTwo));
        System.out.println("\nIntersection collection: " + myColl.intersection(arrListOne, arrListTwo));
        System.out.println("\nUnion without dublicate: " + myColl.unionWithoutDuplicate(arrListOne, arrListTwo));
        System.out.println("\nIntersection without duplicate: " + myColl.intersectionWithoutDuplicate(arrListOne, arrListTwo));
        //System.out.println("\nDifference: " + myColl.difference(arrListOne,arrListTwo));
        System.out.println("\nasList: " + myList.asList(strings));
        System.out.println("\nSorted List:" + myList.sortedList(myDouble));



    }
}
