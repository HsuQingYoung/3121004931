package com.myproject;

public class TestReadTextFromFile {
    public static void main(String[] args) {
        String originalFilePath = "D:\\softwork\\测试文本\\orig.txt";//原文路径；
        ReadTextFromFile rtff=new ReadTextFromFile();
        String originalText=rtff.readFromFile(originalFilePath);//原文
        System.out.println(originalText);
    }
}
