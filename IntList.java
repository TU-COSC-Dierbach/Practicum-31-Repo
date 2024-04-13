// IntList Class to Complete
public class IntList {
  private IntNode head;

  public IntList() {
  // Inits as empty list
    head = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  // ** TO COMPLETE **
  public void insert(int new_value) {
    // Check if list empty. If so, make first node.

    
    // if not empty, search for last node and append



    
  // Display Method
  public void displayList() {
    if(head == null) 
      System.out.println("* empty list * ");
    else {
      IntNode tempPtr = head;
      
      while(tempPtr != null) {
        System.out.println(tempPtr.getValue());
        tempPtr = tempPtr.getNext();
      }
    }
  }
}
