
// Sorted Array To BST


class Node{
    int data;
    Node left,right;
    public Node(int val){
        data=val;
    }
  
}
class Bst{
    static Node root;
 
   Node arrayToBST(int a[],int start,int end)
{
    if (start>end){
        return null;
    }
    int mid=(start+end)/2;
    Node node=new Node(a[mid]);
    node.left=arrayToBST(a,start,mid-1);
    node.right=arrayToBST(a,mid+1,end);
    return node;
}
void Traversal(Node node){
    if(node==null){
        return;
    }
    System.out.println(node.data);
    Traversal(node.left);
    Traversal(node.right);
}
public static void main(String arg[]){
    Bst tree=new Bst();
    int a[]=new int[]{1,2,3,4,5,6,7,8};
    int n=a.length;
    root=tree.arrayToBST(a,0,n-1);
    tree.Traversal(root);
    
}
}
    


