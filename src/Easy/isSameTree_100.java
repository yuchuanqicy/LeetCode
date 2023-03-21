package Easy;

/**
 * @ClassNmae isSameTree_100
 * @Author:yys4608
 * @Date: 2022/11/7 14:41
 * @Description:比较两棵二叉树是否相同
 */
public class isSameTree_100 {
    // 递归DFS
    public boolean isSameTree_dfs(TreeNode p, TreeNode q) {
        if (p==null &&q==null){
            return true;
        }else if (p==null || q==null){
            return false;
        }else  if (p.val!=q.val){
            return false;
        }else {
            return isSameTree_dfs(p.left,q.left)&&isSameTree_dfs(q.right,q.right);
        }
    }
    //dfs迭代方式
    public boolean isSameTree_dfs_iterate(TreeNode p,TreeNode q){

        return false;
    }
    public boolean isSameTree_bfs(TreeNode p,TreeNode q){

        return false;
    }
}
