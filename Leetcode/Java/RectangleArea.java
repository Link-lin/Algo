public class RectangleArea{

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int areaA = Math.abs((A-C)*(B-D));
        int areaB = Math.abs((E-G)*(F-H)); 

        int left = Math.max(A, E);
        int right = Math.min(G, C);
        int bottom = Math.max(F, B);
        int top = Math.min(D, H);

        int overlap = 0;
        if(right > left && top > bottom)
             overlap = (right - left) * (top - bottom);
        
        return areaA + areaB - overlap;
    }

    public static void main(String[] args){

    }
}