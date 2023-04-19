package sba_core_java.exercise1;

import java.util.ArrayList;

public class MyOperation implements IMyOperations {
    private ArrayList<String> myArrayList;

    public ArrayList<String> getMyArrayList() {
        return myArrayList;
    }

    public MyOperation() {
        this.myArrayList = new ArrayList<>();
    }

    public void setMyArrayList(ArrayList<String> myArrayList) {
        this.myArrayList = myArrayList;
    }

    @Override
    public void convertStringArrayIntoArrayList(String[] stringArray) {
        for (String element : stringArray) {
            myArrayList.add(element);
        }
    }

    @Override
    public void replaceAnElementInTheStringArrayListGiven(int index) {
        myArrayList.set(index, "Nah");
    }

    @Override
    public ArrayList<String> createANewArrayListFromExistingArray() {
        ArrayList<String> copy = new ArrayList<>(myArrayList);
        copy.remove("Nah");
        return copy;
    }
}
