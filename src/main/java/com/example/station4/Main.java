package com.example.station4;

public class Main {
    public static void main(String[] args) {
        // ここから
        int[] users = new int[5];
        users[0] = 23;
        users[1] = 36;
        users[2] = 31;
        users[3] = 48;
        users[4] = 58;
        double all = 0.0;
        for (int i = 0; i < users.length; i++) {
            all = all + users[i];
        }

        System.err.println(all/5.0);
        // ここまで
    }
}
