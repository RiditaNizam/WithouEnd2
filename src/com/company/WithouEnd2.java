package com.company;

/**
 * Created by ridita on 5/15/17.
 */
public class WithouEnd2 {
    public String withouEnd2(String str) {

        if (str.length() <= 2) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }

    }
}
