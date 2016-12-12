 public class Node
 {
  String word;
  Node left; 
  Node right;
  Node parent;
  int count;
  
  Node(String a)
  {
   this.word = a;
   this.parent = null;
   this.left = null;
   this.right = null;
   this.count = 1;
  }
 }
 