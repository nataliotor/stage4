package com.home_01_03_23;

public class dff {
        public static void main(String[] args) {
            String [] arr = {"abc", "TrUe", "false", null, "FALSE"};
            for(String s : arr) {
                System.out.print(Boolean.valueOf(s) ? "T" : "F");
            }
        }
    }

