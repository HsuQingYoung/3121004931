package com.myproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFromFile {
    public static String readFromFile(String filePath){
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n"); // 将每行内容追加到StringBuilder，并添加换行符
                //sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String text = sb.toString();
        return text;
    }
}
