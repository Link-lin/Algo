
import java.util.*;

class MaxInterval {

    public static int maxInter(int S[], int E[]){
        Arrays.sort(S);
        Arrays.sort(E);
        int guests = 1, max_chair = 1;
        int i = 1, j = 0; 

        while (i < S.length && j < S.length) 
        { 
            if (S[i] <= E[j]) 
            { 
                if (guests > max_chair) { 
                    max_chair = guests; 
                } 
                guests++; 
                i++; 
            }
            else {
                guests--; 
                j++; 
            } 
        } 
        return max_chair;
    }

    public static int interseciton(int[] nums1, int[] nums2){
        HashSet<Integer> h = new HashSet<>();
        List<Integer> x =  new ArrayList<>();

        for(int i =0; i< nums1.length; i++){
            h.add((Integer)nums1[i]);
        }
        Iterator<Integer> itr = h.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(int j =0; j< nums2.length; j++){
            if(h.contains((Integer)nums2[j])){
                x.add(((Integer)nums2[j]));
            }
        }
        int[] y = new int[x.size()];
        for (int i =0; i < x.size(); i++) {
            y[i] = x.get(i); 
        }   
        return y.length;
    }
    public static void main (String args[]){
        int[] a = {1,2,6,6,5,3};
        int[] b = {5,5,7,6,6,8};
        int c = maxInter(a, b);
        System.out.println(c);
    }
}