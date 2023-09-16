package com.myproject;

import org.ansj.splitWord.analysis.ToAnalysis;

public class main {
    public static void main(String[] args) {
        String originalFilePath = args[0];//原文路径；
        String copiedFilePath = args[1];//抄袭路径
        String answerFilePath = args[2];//答案路径

        ReadTextFromFile rtff=new ReadTextFromFile();
        String originalText=rtff.readFromFile(originalFilePath);//原文
        String copiedText=rtff.readFromFile(copiedFilePath);//抄袭
        String answer=rtff.readFromFile(answerFilePath);//相似度



    }
}
