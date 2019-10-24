package com.company;

public class Main {

    public static void main(String[] args) {
        Main m=new Main();
        int number=8;
        int factorial=1;
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        for(int i=1;i<=number;i++){                           // using a cycle
            factorial*=i;
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println(factorial+ ", "+ estimatedTime);
        startTime = System.nanoTime();
        factorial=m.f(number);                                //call method recursion
        estimatedTime = System.nanoTime() - startTime;
        System.out.println(factorial+", "+ estimatedTime);

    }

    public int f(int a){                                      // method recursion
        int result;
        if(a == 1)
            return 1;
        result = f(a - 1) * a;

        return result;
    }
}
