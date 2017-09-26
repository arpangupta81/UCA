package data_structures;

import java.util.Queue;
import java.util.LinkedList;
class NodeTree
{
	int data;
	NodeTree left;
	NodeTree right;
	NodeTree()
	{
		
	}
	NodeTree(int a)
	{
		data = a;
		left = null;
		right = null;
	}
}

class tree
{
	//Queue a = new Queue();
	NodeTree root;
	tree(){
		root = null;
	}
	void insert(int key) {
	       root = insertRec(root, key);
	    }
	     
	NodeTree insertRec(NodeTree root, int key) {
	 
	        if (root == null) {
	            root = new NodeTree(key);
	            return root;
	        }
	 
	        if (key < root.data)
	            root.left = insertRec(root.left, key);
	        else if (key > root.data)
	            root.right = insertRec(root.right, key);
	 
	        return root;
	    }
	
	void inorderr()
	{
		inorder(root);
	}
	
	void inorder(NodeTree root)
	{
		if(root != null)
		{	
			inorder(root.left);
			System.out.println(root.data + " " );
			inorder(root.right);
		}
	}
	
	int search(int key)
	{
		return searchrec(root, key); 
	}
	
	int searchrec(NodeTree root, int key)
	{
		if(root.data == key)
		{
			return 1;
		}
		else if(root.data < key)
		{
			if(root.right != null)
					return searchrec(root.right, key);
		}
		else if(root.data > key)
		{	
			if(root.left != null)
				return searchrec(root.left, key);
		}
		return 0;
	}
	
	void levelorder(){
		levelorderr(root);
		
	}
	void levelorderr(NodeTree root)
	{
		if(root == null)
            return;
         
        // Create an empty queue for level order tarversal
        Queue<NodeTree> q =new LinkedList<>();
         
        // Enqueue Root and initialize height
        q.add(root);
         
        System.out.println("Level Order: ");
         
        while(!q.isEmpty())
        {
        	NodeTree a = q.peek();
        	//50 30 70 20 40 60 80 q.remove();
        	System.out.print(a.data + " " );
 
        	
        	if(a.left != null)
        		q.add(a.left);

        	if(a.right != null)
        		q.add(a.right);
        	
        	q.remove();
        }
	}
	
}
public class binary_search_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tree tree = new tree();
		tree.insert(50);
	    tree.insert(30);
	    tree.insert(20);
	    tree.insert(40);
	    tree.insert(70);
	    tree.insert(60);
	    tree.insert(80);
		
	    /*
	     *          50
	     *     30      70   
	     * 20    40   60   80
	     * 
	    
	    */
	    //tree.inorderr();
	    
	    tree.levelorder();
	    
		System.out.println("Found = " + tree.search(50));
	}

}
