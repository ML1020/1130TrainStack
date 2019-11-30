class TreeNode{
    TreeNode right = null;
    TreeNode left = null;
}
public class Mirror {
    public void Mirror(TreeNode root){
        //若根结点为空，则二叉树镜像
        if (root == null){
            return;
        }
        //结点的左右子结点为null，不用处理
        if (root.right == null && root.left == null){
            return;
        }
        //将结点的左右子结点交换
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        //递归处理
        //先进行左递归处理，将树的左边支树一次循环
        if (root.left != null){
            Mirror(root.left);
        }
        if (root.right != null){
            Mirror(root.right);
        }
    }
}
