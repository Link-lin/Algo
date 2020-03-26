public class TwoSum2{

    public static int[] twoSum(int[] numbers, int target){
        int first = 0;
        int second = numbers.length -1;
        int[] result = new int[2]; 
        while(first < second){
            int temp =  numbers[first] + numbers[second];
            if(temp == target){
                result[0] = first+1;
                System.out.print(result[0]);
                result[1] = second +1;
                System.out.print(result[1]);
                break;
            }
            else if(temp > target){
                second --;
            }
            else{
                first ++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        twoSum(arr, 9);
    }
}