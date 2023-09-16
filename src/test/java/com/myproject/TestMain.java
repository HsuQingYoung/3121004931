package com.myproject;

public class TestMain {
    public static void main(String[] args) {
        String originalFilePath = "D:\\softwork\\测试文本\\orig.txt";//原文路径；
        String copiedFilePath = "D:\\softwork\\测试文本\\orig_0.8_del.txt";//抄袭路径
        String answerFilePath ="D:\\softwork\\测试文本\\CosSimility.txt";

        FileOperation rtff=new FileOperation();
        String originalText=rtff.readFromFile(originalFilePath);//原文
        String copiedText=rtff.readFromFile(copiedFilePath);//抄袭
        String answer=rtff.readFromFile(answerFilePath);//相似度
        CosSimility cos=new CosSimility();
        Double result=cos.getCosSimility(originalText,copiedText);
        rtff.writeIntoFile(answerFilePath,result.toString());
    }
}
