package com.company;

public class ThreadMain {
    private SimpleThread first;
    private SimpleThread second;

    private ThreadMain(String firstName, String secondName) {
        first = new SimpleThread(firstName);
        second = new SimpleThread(secondName);
    }

    public static void main(String[] args) {
        ThreadMain threadMain = new ThreadMain("FirstThread", "SecondThread");
        threadMain.startThreads();
        threadMain.waitForThreadsToFinish();
        threadMain.displayArrayElements();

    }

    private void startThreads() {
        first.start();
        second.start();
    }

    private void waitForThreadsToFinish() {
        while (first.isAlive() || second.isAlive()) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void displayArrayElements() {
        for (int i = 0; i < 1000; ++i) {
            int element = SimpleThread.getArrayElement(i);
            System.out.println(element);
        }
    }
}