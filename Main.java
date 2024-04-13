// Test Driver for IntNode Class
class Main {
  public static void main(String[] args) {
    int new_value;
    IntNode head, tempPtr;

    // Check if Empty List
    head = null;
    System.out.println("\nEXPECTED OUTPUT: \n* empty list *");
    System.out.println("\nACTUAL OUTPUT:");
    displayList(head);

    // Check List of One Node
    head = new IntNode(1, null);
    System.out.println("EXPECTED OUTPUT:");
    System.out.println("1");
    System.out.println("\nACTUAL OUTPUT:");
    displayList(head);

    // Check List of Multiple Nodes
    tempPtr = head;
    new_value = 2;
    
    while(new_value <= 10) {
      tempPtr.setNext(new IntNode(new_value, null));
      tempPtr = tempPtr.getNext();
      new_value = new_value + 1;
    }
    
    System.out.println("EXPECTED OUTPUT: ");
    for(int i = 1; i <= 10; i++)
      System.out.println(i);
    
    System.out.println("\nACTUAL OUTPUT:");
    displayList(head);

    // Check of Appended New Node (** TO COMPLETE **)
    //
    // Add code that (1) sets tempPtr to the first node
    // of the list, (2) traverses tempPtr until it is
    // at the last node, (3) appends a new node with
    // the value 11 to the last node, (4) calls displayList
    // to display the complete list.









    
  }

  public static void displayList(IntNode first) {
    
    if(first == null)
      System.out.println("* empty list *");
    else {
      IntNode tempPtr = first;
      while(tempPtr != null) {
        System.out.println(tempPtr.getValue());
        tempPtr = tempPtr.getNext();
      }
    }
    
    System.out.println();
  }
}