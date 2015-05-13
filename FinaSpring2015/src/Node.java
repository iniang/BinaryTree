


public class Node
   {
   public int iData;              // key item
   public double dData;           // data item
   public Node leftChild;         // left side node
   public Node rightChild;        // right side child

   public void displayNode()      // display node
      {
      System.out.print('{');
      System.out.print(iData);
      System.out.print(", ");
      System.out.print(dData);
      System.out.print("} ");
      }
   }  // end class Node