import java.util.*;

public class uglyNum2{

    int nthUglyNumber(int n) {
        List<Long> uglies = new ArrayList<>();  //to hold our uglies
        TreeSet<Long> set = new TreeSet<>(); //SortedSet
        set.add(1L);  // add 1
        for(int i=1; i<=n; i++){
            long c = set.first(); // keep track of the first
            uglies.add(c); // add to list
            set.add(2 * c); // number * 2
            set.add(3 * c); // number * 3
            set.add(5 * c); // number * 5
            set.remove(c);//remove previous first
        }
        return uglies.get(n - 1).intValue();
    }
    public static void main(String[] args){

    }
}