package com.myproject;

public class TestReadTextFromFile {
    public static void main(String[] args) {
        String originalFilePath = "D:\\softwork\\测试文本\\orig.txt";//原文路径；
        FileOperation rtff=new FileOperation();
        String originalText=rtff.readFromFile(originalFilePath);//原文
        System.out.println(originalText);
    }
}
