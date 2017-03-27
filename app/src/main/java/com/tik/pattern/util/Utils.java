package com.tik.pattern.util;


import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {

    public static String getStringFromAssets(Context context, String fileName){
        try {
            InputStreamReader isr = new InputStreamReader(context.getAssets().open(fileName));
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            StringBuffer sb = new StringBuffer();
            while ((line = br.readLine()) != null){
                sb.append(line).append("\n");
            }
            isr.close();
            br.close();
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
