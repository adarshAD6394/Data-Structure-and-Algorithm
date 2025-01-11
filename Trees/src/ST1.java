public class ST1 {
    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};
        ST tree = new ST(arr);
//        tree.display();
        System.out.println(tree.query(1,6));
    }
}
