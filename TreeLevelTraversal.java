
import java.util.LinkedList;
import java.util.Queue;
public class TreeLevelTraversal
{
    // Create Tree
    static class Tree{
        int data;
        Tree left,right;
        public Tree(int value){
            data=value;
            left=right=null;
        }
    }
    // Level Wise Traversals Using Queue
  static  void PrintLevelWise(Tree root){
        Queue<Tree> q = new LinkedList<Tree>();
        q.add(root);
        
        
        while(!q.isEmpty()){
            Tree Temp=q.poll();
            
            System.out.println(Temp.data);
            
            
            if(Temp.left!=null){
                q.add(Temp.left);
            }
            if(Temp.right!=null){
                q.add(Temp.right);
            }
            
            
            
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Tree Level Wise Traversal");
        Tree root=new Tree(10);
        root.left=new Tree(20);
        root.right=new Tree(30);
        root.left.left=new Tree(40);
        root.left.right=new Tree(50);
        root.right.left=new Tree(60);
        root.right.right=new Tree(70);
        PrintLevelWise(root);
        
    }
}

