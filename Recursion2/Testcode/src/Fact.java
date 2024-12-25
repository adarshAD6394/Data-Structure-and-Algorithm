import java.lang.reflect.Array;
import java.util.Arrays;

public class Fact {
    public static void main(String[] args) {
        int area = 37;
        int i = 1;
        int j = i;
        double square = Math.sqrt(area);
        if(square%1 == 0){
            System.out.println(square);
        }
        else{
            System.out.println(Arrays.toString(productOfFact(i, j, area)));
        }
    }
        public static int[] productOfFact(int i, int j, int area){
            int[] react = new int[2];
            while(i <= area){
                if(area%i == 0){
                    break;
                }
                i++;
            }
            if(area == i*j){
                react[0] = i;
                react[1] = j;
            }
            else{
                j = i;
                i++;
               react = productOfFact(i, j ,area);
            }
            return react;
        }
}
