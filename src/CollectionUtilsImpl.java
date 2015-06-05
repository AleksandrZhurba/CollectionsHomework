import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils  {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        ArrayList<Integer> arrListOne = new ArrayList<Integer>();
        ArrayList<Integer> arrListUnion = new ArrayList<Integer>();

        arrListOne.addAll(a);
        arrListUnion.addAll(b);
        arrListUnion.addAll(arrListOne);

        return arrListUnion;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        ArrayList <Integer> arrListOne = new ArrayList<Integer>();
        ArrayList <Integer> arrListTwo = new ArrayList<Integer>();

        ArrayList <Integer> arrListIntersection = new ArrayList<Integer>();

        arrListOne.addAll(0, a);
        arrListTwo.addAll(0, b);


        for (int i = 0; i < arrListOne.size(); i++) {
            for (int j = 0; j < arrListTwo.size(); j++) {
                if (arrListOne.get(i).equals(arrListTwo.get(j))) {
                    arrListIntersection.add(arrListOne.get(i));
                    continue;
                }
            }
        }

        return arrListIntersection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        HashSet setOne = new HashSet();
        HashSet setUnion = new HashSet();

        setOne.addAll(a);
        setUnion.addAll(b);
        setUnion.addAll(setOne);

        return setUnion;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        HashSet<Integer> setOne = new HashSet<Integer>();
        HashSet<Integer> setTwo = new HashSet<Integer>();

        HashSet<Integer> setIntersectionWithoutDup = new HashSet<Integer>();

        setOne.addAll(a);
        setTwo.addAll(b);

        for (Iterator itI = setOne.iterator(); itI.hasNext();){
            Integer elI = (Integer) itI.next();
            for (Iterator itJ = setTwo.iterator(); itJ.hasNext();) {
                Integer elJ = (Integer) itJ.next();
                if (elI.equals(elJ)) {
                    setIntersectionWithoutDup.add(elI);
                }
            }
        }

        return setIntersectionWithoutDup;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        // ***not yet***

        ArrayList<Integer> arrListOne = new ArrayList<Integer>();
        ArrayList<Integer> arrListTwo = new ArrayList<Integer>();
        ArrayList<Integer> arrDifference = new ArrayList<Integer>();

        arrListOne.addAll(a);
        arrListTwo.addAll(b);

        for (int i = 0; i < arrListOne.size();i++) {
            for (int j = 0; j < arrListTwo.size();j++) {
                if (arrListOne.get(i).equals(arrListTwo.get(j))) {
                    arrListTwo.remove(j);
                }
            }


        }
        arrDifference.addAll(arrListTwo);

        return arrDifference;
    }
}
