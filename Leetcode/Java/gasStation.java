public class gasStation {

    // O(n^2) solution
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int re = -1;
        for(int i =0; i < gas.length; i++){
            //if(re = (possible(gas, cost, i) != -1)) break;
        }
        
        return re;
    }

    public static int possible(int[] gas, int[] cost, int x){
        int gasleft = 0;
        for(int i = x; i < x+gas.length; i++){
            int index = i % gas.length; 
            gasleft += gas[index]-cost[index];
            System.out.println("index: " +index + "gasLeft:" +gasleft);
            if(gasleft <0) return -1;
        }
        System.out.println();
        return x;
    }

    // Greedy Solution
    public static int canCompleteCircuit2(int[] gas, int[] cost){
        // Find maximum difference
        int[] fuel = new int[gas.length];
        int start = 0;
        int sum = 0;
         for(int i = 0;i<gas.length;i++)
        {
            fuel[i] = gas[i] - cost[i];
            sum+=fuel[i];
            if(sum<0)
            {
                sum = 0;
                start = i+1;
                if(start == gas.length)
                {
                    return -1;
                }
            }
        }
        return possible(gas, cost, start);
    }

    
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {3,4,5,1,2};
        canCompleteCircuit(a, b);
    }
}