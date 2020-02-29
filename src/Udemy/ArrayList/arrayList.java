package Udemy.ArrayList;

import java.util.ArrayList;

public class arrayList {
    private ArrayList<String> arrayList = null;

    public void addData(String data) {
        arrayList.add(data);
    }

    public void removeData(int index) {
        arrayList.remove(index);
    }

    public void viewAllData() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }


}
