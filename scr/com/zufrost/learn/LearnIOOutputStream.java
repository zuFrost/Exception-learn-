package com.zufrost.learn;

public class LearnIOOutputStream {
    class Quest{
        int counter;
        java.io.OutputStream out;
        Quest(){/* initialization of out */}
        float inc() {
            try { counter++; out.write(counter); }
            //comments
            catch (java.io.IOException e){};
            return counter;

        }
    }
}
