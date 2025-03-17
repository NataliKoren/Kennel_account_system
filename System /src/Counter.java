‎System/src/Controller/Counter.java
+4
-4
Original file line number	Diff line number	Diff line change
@@ -1,17 +1,17 @@
﻿package Controller;

public class Counter implements AutoCloseable{
public class Counter implements AutoCloseable {

    static int sum;
    {
        sum = 0;
    }

    public void add(){
        sum ++;
    public void add() {
        sum++;
    }
    
    @Override
    public void close() {
        System.out.println("Counter closed");
    }
