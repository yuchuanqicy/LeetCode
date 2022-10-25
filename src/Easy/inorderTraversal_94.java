package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yuchuanqi
 * @Date: 2022/10/18/23:16
 * @Description:
 */
public class inorderTraversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Order(root,res);
        return res;
    }
    public void Order(TreeNode root,List<Integer> res){
        if (root==null)
            return;
        Order(root.left,res);
        res.add(root.val);
        Order(root.right,res);
    }
}
