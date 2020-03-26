class kthSmallestInBst{

    public static int getDepth(TreeNode node){
        return getDepthHelper(node);
    }

    public static int getDepthHelper(TreeNode node){
        int count = 1;

        if (node == null){
            return 0;
        }
        if(node.left != null){
            count += getDepth(node.left);
        }
        if(node.right != null){
            count += getDepth(node.right);
        }
        return count;
    }

    // O(n) time O(1) space
    public static int kthSmallest(TreeNode root, int k) {
        int left = 0;
        if (root == null)  return 0;
        if(root.left != null) left = getDepth(root.left);
        int re;
        if (left == k-1){
            return root.val;
        }
        if (left > k){
            re = kthSmallest(root.left, k);
        }
        else {
            re = kthSmallest(root.right, (k-left-1));
        }

        return re;
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        //root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        //System.out.print(getDepth(root.left)); 
        System.out.print(kthSmallest(root, 2));


    }
}