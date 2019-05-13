package com.company;



class SimpleThread extends Thread {

    private static int[] myArray = new int[1000];

    SimpleThread(String str) {
        super(str);
    }

    public void run() {

        if (getName().equals("FirstThread")) {

            addToArray(0,500);
        }
        if (getName().equals("SecondThread")) {

            addToArray(500,1000);
        }
    }

    private void addToArray(int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; ++i) {
            int aNumber = 0;
            myArray[i] = aNumber + i;
        }
    }

    public static int getArrayElement(int index) {
        return myArray[index];
    }
}
