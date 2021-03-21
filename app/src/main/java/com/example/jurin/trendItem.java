package com.example.jurin;

import android.media.Image;
import android.widget.ImageView;

import java.util.ArrayList;

public class trendItem {
    public int trendNumber;
    public String trendName;
    public trendItem(int trendNumber, String trendName) {
        this.trendNumber = trendNumber;
        this.trendName = trendName;
    }
    public static ArrayList<trendItem> createContactsList(int numContacts) {
        ArrayList<trendItem> contacts = new ArrayList<trendItem>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new trendItem(i, "wohahahaha"));
        }

        return contacts;
    }
}
