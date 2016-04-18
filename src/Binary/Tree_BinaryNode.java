package Binary;

public class Tree_BinaryNode {
char item;
Tree_BinaryNode parent;
Tree_BinaryNode left;
Tree_BinaryNode right;

public Tree_BinaryNode(char item) {
	
	this.item = item;
	this.parent = null;
	this.left = null;
	this.right = null;
	
}

 public Tree_BinaryNode left() {
	if (this.left == null)
		return null;
	else return this.left;
}
		
		
 public boolean isLeft() {
	 if (this.left == null)
		 return false;
	 else return true;
	 
 }
 
 public Tree_BinaryNode right() {
		if (this.right == null)
			return null;
		else return this.right;
		
	}
 
 public boolean isRight() {
	 if (this.right == null)
		 return false;
	 else return true;

		
	}
 
 public void binaryPreorder() {
	 
	 System.out.print(this.item);
	 if (this.isLeft())
		 this.left.binaryPreorder();
	 if(this.isRight())
		 this.right.binaryPreorder();
	
 }
public void binaryPostorder() {
	 
	 System.out.print(this.item);
	 if (this.isLeft())
		 this.left.binaryPostorder();
	 if(this.isRight())
		 this.right.binaryPostorder();
	

}
public void binaryInorder() {
	 
	 System.out.print(this.item);
	 if (this.isLeft())
		 this.left.binaryInorder();
	 if(this.isRight())
		 this.right.binaryInorder();
	
}
}
