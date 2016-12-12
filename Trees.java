import java.util.*;
import java.io.*;

public class Trees
{ 
 Node tree;
 //Constructor for Trees
 public Trees() 
 {
  this.tree = null;
 }
 //Method returns true if tree is empty
 public boolean empty()
 {
  return this.tree == null;
 }
 //add method
 public void insert(String a)
 {
  a = a.toLowerCase();
  Node newNode = new Node(a);
  this.insert(this.tree, newNode);
 }
 //print method
 public void print()
 {
  print(this.tree);
 }
 //printing the tree in order
 public void print(Node n)
 {
  if(n != null)
  {
   this.print(n.left);
   System.out.println(n.word + " " + n.count);
   this.print(n.right);
  }
 }
//method where you add both nodes
 public void insert(Node a, Node n)
 {
  if(empty())
  {
   this.tree = n;
  }
  else if(n.word.compareTo(a.word) == 0)
  {
   a.count++;
  }
  else if(n.word.compareTo(a.word) < 0)
  {
   if(a.left == null)
   {
    a.left = n;
    n.parent = a;
   }
   else
   {
    this.insert(a.left, n);
   }
  }
  else
  {
   if(a.right == null)
   {
    a.right = n;
    n.parent = a;
   }
   else
   {
    this.insert(a.right, n);
   }
  }
 }
 
 //Method to find a node
 public String search(String a)
 {
  Node f = tree;
  while(f != null)
  {
   if(f.word.compareTo(a) == 0)
   {
    return f.word + " was found";
   }
   else if(f.word.compareTo(a) > 0)
   {
    f = f.left;
   }
   else
   {
    f = f.right;
   }
  }
  return "null";
 }
}