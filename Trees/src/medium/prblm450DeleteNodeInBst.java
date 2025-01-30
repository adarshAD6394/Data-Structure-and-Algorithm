package medium;

import Trees.TreeNode;

import static Trees.TreeNode.buildTree;

public class prblm450DeleteNodeInBst {
    public void main(String[] args) {
        Integer[] input = {10,5,15,3,7,13,18,1,null,6};
        TreeNode.Node root = buildTree(input);
        int n = 13;
        System.out.println(one( n));
    }
//    public TreeNode deleteNode(TreeNode.Node root, int key) {
//
//    }

    public boolean one(int num){
        if(num == 1) return true;
        if(num%2 == 0){
            while(num%2 == 0){
                num = num/2;
            }
        }else{
            num = num*3+1;
        }
        return one(num);
    }
}
