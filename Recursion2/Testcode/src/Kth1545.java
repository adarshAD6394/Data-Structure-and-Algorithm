public class Kth1545 {
    public static void main(String[] args) {
        int n = 4;
        int k = 11;
        String s = "0";
        System.out.println(kthString(n, k, s));
    }

    static char kthString(int n, int k, String str){
        StringBuilder invert = new StringBuilder();
        if(n>1) {
            for (char c : str.toCharArray()) {
                invert.append(c == '0' ? '1' : '0');
            }
            invert.reverse();
            invert.insert(0, str);
            invert.insert(str.length(), "1");
            return kthString(n - 1, k, invert.toString());
        }
        else{
            return str.charAt(k-1);
        }
    }
}
