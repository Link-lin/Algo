import java.util.*;

class IntersectionOfArray{
    
    public static int[] interseciton(int[] nums1, int[] nums2){
        HashSet<Integer> h = new HashSet<>();
        List<Integer> x =  new ArrayList<>();

        for(int i =0; i< nums1.length; i++){
            h.add((Integer)nums1[i]);
        }

        
        for(int j =0; j< nums2.length; j++){
            if(h.contains((Integer)nums2[j]) && !x.contains((Integer)nums2[j])){
                x.add(((Integer)nums2[j]));
            }
        }
        
        /*
        for(int j =0; j< nums2.length; j++){
            if(h.contains((Integer)nums2[j])){ 
                x.add(((Integer)nums2[j]));
            }
        }
        */

        int[] y = new int[x.size()];
        for (int i =0; i < x.size(); i++) {
            y[i] = x.get(i); 
        }   
        return y;
    }
    public static void main(String[] args){
        int[] a = {1,2,5,5,9};
        int[] b = {4,5,5,12,12};
        int[] c = interseciton(a, b);
        for(int i = 0 ; i < c.length; i++){
            System.out.println(c[i]);
        }
    }
}