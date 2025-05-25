package A_aCheatSheet;

import java.util.ArrayList;

public class ArrayList_CheatSheet {

    //CREATION------------------------------
    ArrayList<MyObject> newArrayList;

    //DUMMY CONSTRUCTOR
    public ArrayList_CheatSheet() {
        this.newArrayList = new ArrayList<>();
    }

    //ADDING OBJECTS TO ARRAYLIST------------------------------------------
    public void addObject(MyObject item) {
        newArrayList.add(item);
    }

    //REMOVING OBJECTS FROM AN ARRAYLIST-------------------------------------
    public void removeObject(MyObject item) {
        newArrayList.remove(item);
    }

    //REMOVING OBJECTS FROM A LIST USING LAMBDA
    public void removeObjectUsingLambda(MyObject item) {
        newArrayList.removeIf(obj -> obj.equals(item));
    }

    //REMOVING A PARTICULAR OBJECT FROM AN ARRAYLIST USING FOREACH-LOOP
    public void removeParticularObjectUsingForEach(MyObject item) {
        for (MyObject obj : newArrayList) {
            if (obj.equals(item)) {
                newArrayList.remove(obj);
                break;  // Exit the loop after removing the object
            }
        }
    }

    //PRINTING THE CONTENTS OF AN ARRAYLIST--------------------------------
    public void printList(ArrayList<MyObject> newArrayList) {
        for (MyObject item : newArrayList) {
            System.out.println(item);
        }
    }

    //FINDING THE OBJECT IN AN ARRAYLIST WITH THE LOWEST/CHEAPEST VALUE OF(X)-------
    public MyObject findObjectWithCheapestX(ArrayList<MyObject> newArrayList) { //this must return the Object you are looking for
        // ArrayList_CheatSheet<Object> newArrayList = new ArrayList_CheatSheet<>(); //create if not asked in the parameter or not existing anywhere in the program
        MyObject objectWithCheapestOrLowestX = null;
        double cheapestOrLowestX = 0;
        double temp = 0; // or some other temporary variable

        for (MyObject item : newArrayList) {
            temp = item.valueYouAreSearchingFor(); //you have to get this value somewhere
            if (objectWithCheapestOrLowestX  == null || temp < cheapestOrLowestX ) {
                objectWithCheapestOrLowestX  = item;
                cheapestOrLowestX  = temp;
            }
        }
        return objectWithCheapestOrLowestX;
    }

    //FINDING THE OBJECT IN AN ARRAYLIST WITH THE HIGHEST VALUE OF(X)-------
    public MyObject findObjectWithHighestX(ArrayList<MyObject> newArrayList) { //this must return the Object you are looking for
        // ArrayList_CheatSheet<Object> newArrayList = new ArrayList_CheatSheet<>(); //create if not asked in the parameter or not existing anywhere in the program
        MyObject objectWithHighestX = null;
        double highestX= 0;
        double temp = 0; // or some other temporary variable

        for (MyObject item : newArrayList) {
            temp = item.valueYouAreSearchingFor(); //you have to get this value somewhere (getter)
            if (temp > highestX ) {
                objectWithHighestX  = item;
                highestX = temp;
            }
        }
        return objectWithHighestX;
    }
}