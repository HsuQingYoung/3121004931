package com.myproject;

public class TestCosSimility {
    public static void main(String[] args) {
        String originalFilePath = "D:\\softwork\\测试文本\\orig.txt";//原文路径；
        String copiedFilePath = "D:\\softwork\\测试文本\\orig_0.8_add.txt";//抄袭路径
        FileOperation rtff=new FileOperation();
        String originalText=rtff.readFromFile(originalFilePath);//原文
        String copiedText=rtff.readFromFile(copiedFilePath);//抄袭
        CosSimility cos=new CosSimility();
        double result=cos.getCosSimility(originalText,copiedText);
        System.out.println(result);
    }
}
