package Udemy.ArrayList;

import java.util.ArrayList;

public class arrayList {
    private ArrayList<String> arrayList = new ArrayList<>();




    public void addData(String data) {
        arrayList.add(data);

    }

    public void removeData(int index) {
        arrayList.remove(index - 1);
    }

    public void viewAllData() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println((i + 1) + arrayList.get(i));
        }
    }

    public void searchingData(String data) {
        int c = 0;
        boolean list = arrayList.contains(data);
        if (list == true) {
            c++;
            System.out.println("The data is searched " + c + " Times");
        } else {
            System.out.println("the data is not found");
        }
    }

    public void modifyData(String data, int index) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == index) {
                arrayList.set(index, data);
            }
        }
        for (int j = 0; j < arrayList.size(); j++) {
            System.out.println("Modified System     " + arrayList.get(j));
        }
    }
    }
