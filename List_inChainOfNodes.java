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

    public int size() {
      if (headReference == null) return 0;
      else return size(headReference);
    }
    public int size(Node currentNode) {
      if (currentNode.getReferenceToNextNode() == null) return 1;
      else return 1 + size(currentNode.getReferenceToNextNode());
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

<<<<<<< HEAD
    // public String toString() { //Recursive
    //   if (headReference == null) return [,];
    //   else return "[" + toString(headReference) + "]";
    // }
    // public String toString(Node currentNode){
    //   if(currentNode.referenceToNextNode == null) return currentNode;
    //   else return currentNode + toString(currentNode.referenceToNextNode);
    // }
=======
    //if (headReference == null) return "[,]";
    //else return toString(headReference);
    //
//     public String toString(Node node) {
//       if (node.getReferenceToNextNode() == null) return node;
//       else return node + "," + toString(node.getReferenceToNextNode());
//     }
>>>>>>> cfe95d996bc916ca34aba45b4408945ed3eb73ee

    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        Node dummyNode = new Node(val, headReference);
        headReference = dummyNode;
        return true;
     }
     public Node get(int index) {
        Node currentNode = headReference;
       for(int i = 0; i < index; i++) {currentNode = currentNode.getReferenceToNextNode();}
       return currentNode;
     }
    public boolean set(int index, Object value) {
      get(index).cargoReference = value;
    return true;
    }
    public boolean add(int index, Object value) {
      if(index == size()) {get(index - 1).getReferenceToNextNode() = new Node(value);}
      else if(index == 0) {addAsHead(value);}
      else {
        dummyNode = new Node(value, get(index));
        get(index - 1).getReferenceToNextNode() = dummyNode;
      }
      return true;
    }
  public boolean remove(int index){
    if(index == size() - 1) {get(index) = null;}
    else if(index == 0) {headReference = get(1);}
    else get(index - 1).getReferenceToNextNode() = get(index + 1);
    return true
  }
}
