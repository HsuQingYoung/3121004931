package com.myproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
    public static String readFromFile(String filePath){//从文件中读取数据
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                //sb.append(line).append("\n"); // 将每行内容追加到StringBuilder，并添加换行符
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String text = sb.toString();
        return text;
    }

        public static void writeIntoFile(String filePath,String result){
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.append(String.valueOf(result));
            System.out.println("相似度已写入文件");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
