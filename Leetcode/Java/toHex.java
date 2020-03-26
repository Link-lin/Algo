/**
 * toHex
 */
public class toHex {

    char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
	
	private String toHexNegative(int num) {
        num = ~num;
        int rem;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            rem = 15 - num % 16;
            sb.append(hex[rem]);
            num /= 16;
        }
        return sb.reverse().toString();
    }
    
    public String toHex1(int num) {
        if (num == 0) {
            return "0";
        }
        if (num < 0) {
            return toHexNegative(num);
        }	
        
		StringBuilder sb = new StringBuilder();				
		int rem;
		
		while(num!=0)
		{
			rem = num%16;			
			sb.append(hex[rem]);
			num /=16;
		}
		
		return sb.reverse().toString();
    }

    public static void main(String[] args) {
        
    }
}