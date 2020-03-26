/**
 * binaryTreeSerialize
 */
public class binaryTreeSerialize {

    public static String serialize(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        if (root == null) {
            builder.append("null ");
            return builder.toString();
        } else {
            builder.append(root.val + " ");
            serializeHelper(builder, root.left);
            serializeHelper(builder, root.right);
        }
        return builder.toString();
    }

    public static void serializeHelper(StringBuilder builder, TreeNode s) {
        if (s == null) {
            builder.append("null ");
            return;
        } else {
            builder.append(s.val + " ");
            serializeHelper(builder, s.left);
            serializeHelper(builder, s.right);
        }
    }

    public static TreeNode deserialize(String data) {
        String[] arr = data.split(" ");
        for(String s: arr){
            System.out.print(s+" ");
        }
        System.out.println("");
        if (arr.length == 1)
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        int x = deserializeHelper(root, false, arr, 1);
        deserializeHelper(root, true, arr, x+1);

        return root;
    }

    public static int deserializeHelper(TreeNode s, Boolean right, String[] arr, int idx) {
        if (right) {
            if (arr[idx].equals("null")) {
                s.right = null;
                return 1;
            } else {
                s.right = new TreeNode(Integer.parseInt(arr[idx]));
                int x = deserializeHelper(s.right, false, arr, idx + 1);
                int y = deserializeHelper(s.right, true, arr, idx + x + 1);
                return x + y + 1;
            }
        } else {
            s.left = (arr[idx].equals("null")) ? null : new TreeNode(Integer.parseInt(arr[idx]));
            // When reach leaf
            if(s.left == null){
                return 1;
            }
            int x = deserializeHelper(s.left, false, arr, idx + 1);
            // The last one has no
            if (idx + x + 1 >= arr.length) {
                return 0;
            } else {
                int y = deserializeHelper(s.left, true, arr, idx + x + 1);
                return x+y+1;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(7);
        TreeNode c = new TreeNode(8);
        TreeNode d = new TreeNode(6);
        root.left = left;
        root.right = right;
        left.left = a;
        a.left = d;
        left.right = b;
        right.left = c;
        right.right = new TreeNode(9);

        System.out.println(serialize(root));
        root = deserialize("3 1 5 6 null null null 7 null null 2 8 null null 9 null null");
        System.out.println(serialize(root));

    }
}