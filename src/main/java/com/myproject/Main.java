package com.myproject;

public class Main {
    public static void main(String[] args) {
        String originalFilePath = args[0];//原文路径；
        String copiedFilePath = args[1];//抄袭路径
        String answerFilePath = args[2];//答案路径

        FileOperation rtff=new FileOperation();
        String originalText=rtff.readFromFile(originalFilePath);//原文
        String copiedText=rtff.readFromFile(copiedFilePath);//抄袭
        String answer=rtff.readFromFile(answerFilePath);//相似度
        CosSimility cos=new CosSimility();
        Double result=cos.getCosSimility(originalText,copiedText);
        rtff.writeIntoFile(answerFilePath,result.toString());




    }
}
