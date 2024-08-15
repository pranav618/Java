package desingPattern.adaptarStructuralDesignPatten;

public class SchoolMain {

    //we want to use PencilPen in AssignmentWork, but PencilPen and Pen are not compatible with each other
    //so now we want to write a Adapter to make it coompatible, then use the PencilPen
    public static void main(String args[]){

        PencilAdapter pencilAdapter = new PencilAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setPen(pencilAdapter);

        assignmentWork.writeAssignmnet("I am lazy to do work");


    }
}
