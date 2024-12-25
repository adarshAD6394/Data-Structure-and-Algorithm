public class kthCharacter {
    public static void main(String[] args) {
        String s = "a";
        StringBuilder str = new StringBuilder();
        int k = 10;
        System.out.println(appendChar(s, str,k));
    }
    public static String appendChar(String s, StringBuilder str, int k){
        if(s.length() >= k+1){
            return s.substring(k-1,k);
        }
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(c == 'z') {
                str.append("a");
            }else {
                c = (char) (c+1);
                str.append(c);
            }
        }
        str.insert(0,s);
        s = str.toString();
        str.setLength(0);
        return appendChar(s, str, k);
        }
    }
