/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */


    /**
      @return the number of elements in this list
     */
    public int size() {
      if (headReference == null) return 0;
      else {
        int sizeCount = 1;
        Node currentNode = headReference;
        while(currentNode.getReferenceToNextNode() != null) {
          sizeCount++;
          currentNode = currentNode.getReferenceToNextNode();
        }
        return sizeCount;
      }
    }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
    public String toString() {
      if (headReference == null) return "[,]";
      else {
        String s = "[" + headReference;
        Node currentNode = headReference;
        while(currentNode.getReferenceToNextNode() != null){
          s += currentNode.getReferenceToNextNode() + ",";
          currentNode = currentNode.getReferenceToNextNode();
        }
        return s + "]";
      }
    }


    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        Node dummyNode = new Node(val, headReference);
        headReference = dummyNode;
        return true;
     }
}
