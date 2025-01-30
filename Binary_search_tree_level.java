public class Binary_search_tree_level {
     
    public static void main(String[] args) {
        BST t=new BST();
       int[] arr={45,27,19,67,79,42,56};
        for(int i=0;i<arr.length;i++){
            t.root=t.insert(t.root, arr[i]);
        }
        int A=t.search(t.root, 45,0);
       if (A!=-1) System.out.println("Node found in BST at "+A+" level");
       else System.out.println("Node Not found");

    }
}
class BST{
    Node root;
     int search(Node root,int target,int c){
        
        if(root==null) {
            return -1;
        }
        else if(root.data==target){
            return c;
        }
        else if(root.data>target){
            return search(root.left, target,c+1);
            
        }
        else {
            return  search(root.right, target,c+1);
            
        }
        
    }
    Node insert(Node root, int ele) {
        if (root == null) return new Node(ele);
        if (ele < root.data) 
            root.left = insert(root.left, ele); 
        else 
            root.right = insert(root.right, ele);
        return root;
    }
    // Node insert(Node root,int ele){
    //     if(root==null){
    //         return new Node(ele);
    //     }
    //     if(ele<root.data){
    //         return insert(root.left, ele);
    //     }
    //     else{
    //         return insert(root.right, ele);
    //     }
    // }
    
}
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
