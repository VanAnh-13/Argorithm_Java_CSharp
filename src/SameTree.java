import java.util.Stack;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        Stack<TreeNode> pTree = new Stack<>();
        Stack<TreeNode> qTree = new Stack<>();

        pTree.add(p);
        qTree.add(q);

        while (!pTree.isEmpty() && !qTree.isEmpty()) {
            TreeNode pNode = pTree.pop();
            TreeNode qNode = qTree.pop();

           if (pNode == null || qNode == null || pNode.val != qNode.val) {
               return false;
           }

           if (((pNode.left == null) != (qNode.left == null)) || ((pNode.right == null) != (qNode.right == null))) {
               return false;
           }

           if (qNode.right != null) {
               qTree.add(qNode.right);
               pTree.add(pNode.right);
           }

           if (pNode.left != null) {
               pTree.add(pNode.left);
               qTree.add(qNode.left);
           }
        }

        return qTree.isEmpty() && pTree.isEmpty();
    }
}
