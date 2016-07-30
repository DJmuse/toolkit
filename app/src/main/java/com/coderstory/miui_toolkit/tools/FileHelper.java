package com.coderstory.miui_toolkit.tools;

import android.content.Context;

import java.io.BufferedReader;
import java.io.InputStreamReader;

 public class FileHelper {

     /**
      * 从Assets中读取文本
      * @param FileName
      * @param mContext
      * @return
      */
    public   String getFromAssets(String FileName, Context mContext){
        try {
            InputStreamReader inputReader = new InputStreamReader( mContext.getAssets().open(FileName),"utf-8" );
            BufferedReader bufReader = new BufferedReader(inputReader);
            String line;
            String Result="";
            while((line = bufReader.readLine()) != null)
                Result += line+"\n";
            return Result;
        } catch (Exception e) {
            e.printStackTrace();
            return  "";
        }
    }
}
