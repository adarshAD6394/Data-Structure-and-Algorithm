public class StringCheck {
    public static void main(String[] args) {
        String s = "PPAALLL";
        int i = 0, cA = 0, cL = 0;
        int len = s.length();
        boolean value = checkRecursively(i, cA, cL, len, s);
        System.out.println(value);
    }
    public static boolean checkRecursively(int i, int cA, int cL, int len, String s){
        if(i < len && s.charAt(i) == 'A'){
            ++cA;
            cL = 0;
            if(cA == 2){
                return false;
            }
            checkRecursively(i+1, cA, cL, len, s);
        }
        else if(i < len && s.charAt(i) == 'L'){
            ++cL;
            if(cL == 3){
                return false;
            }
            checkRecursively(i+1, cA, cL, len, s);
        }
        else if( i < len && s.charAt(i) == 'P'){
            cL = 0;
            checkRecursively(i+1, cA, cL, len, s);
        }
        return true;
    }
}
