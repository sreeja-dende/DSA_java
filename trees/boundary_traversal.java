// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.ArrayList;
import java.util.List;
class node
{
    int val;
    node left;
    node right;
    node(int key)
    {
        val=key;
    }
}

class Main {
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
         root.right.right=new node(7);
        root.left.left=new node(4);
        root.left.right=new node(5);
         root.left.right.left=new node(8);
         root.left.right.right=new node(9);
        System.out.println(boundaryOfBinaryTree(root));
    }
    public static boolean isLeaf(node node) {
        return node.left == null && node.right == null;
    }
        public static List<Integer> boundaryOfBinaryTree(node root){
            List<Integer> ans=new ArrayList<>();
          if (root == null)
            return ans;
          if(!isLeaf(root))
              ans.add(root.val);
          addLeftBoundary(root.left, ans);
          addLeaves(root,ans);
          addRightBoundary(root.right,ans);
            return ans;
        }
    public static void addLeftBoundary(node root,List<Integer> ans)
    {
        node current=root;
        while(current!=null)
            {
                if(!isLeaf(current)) ans.add(root.val);
                if(current.left!=null) current=current.left;
                else
                    current=current.right;
            }
        
    }
    public static void addLeaves(node root,List<Integer> ans)
    {  if(root==null) return;
        if(isLeaf(root)) 
        {ans.add(root.val); 
         return;}
        addLeaves(root.left,ans);
       addLeaves(root.right,ans);
    }
     public static void addRightBoundary(node root,List<Integer> ans)
    { node current=root;
      List<Integer> temp = new ArrayList<>();
        while(current!=null)
            {
                if(!isLeaf(current)) temp.add(root.val);
                if(current.left!=null) current=current.left;
                else
                    current=current.right;
            }
      for(int i=temp.size()-1;i>=0;i--)
          {
              ans.add(temp.get(i));
          }
        
    }
    
}
