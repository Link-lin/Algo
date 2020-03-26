class isSameTree{
    public boolean isSameTree1(TreeNode p, TreeNode q) {
        if((p != null && q != null && p.val == q.val)) 
		    return isSameTree1(p.left, q.left) && isSameTree1(p.right, q.right);
	    else if(p == null && q == null)  return true;
	    return false;
    }
    public static void main(String[] args){

    }
}