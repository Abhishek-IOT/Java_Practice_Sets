package Udemy.ArrayList;

import java.util.ArrayList;

public class arrayList {
    private ArrayList<String> arrayList = new ArrayList<>();




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

    public void searchingData(String data) {
        boolean list = arrayList.contains(data);
    }

    public void modifyData(String data, int index) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == index) {
                arrayList.set(index, data);
            }
        }
        for (int j = 0; j < arrayList.size(); j++) {
            System.out.println("Modified System" + arrayList.get(j));
        }
    }
    }
