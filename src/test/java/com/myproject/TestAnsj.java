package com.myproject;

import org.ansj.recognition.impl.StopRecognition;
import org.ansj.splitWord.analysis.ToAnalysis;

import java.util.HashMap;
import java.util.Map;

public class TestAnsj {
    public static void main(String[] args) {
        StopRecognition filter = new StopRecognition();
        //过滤掉标点
        filter.insertStopNatures("w");
        Map<String,Integer> map1= new HashMap<>();
        String originalFilePath = "D:\\softwork\\测试文本\\orig.txt";//原文路径；
        ReadTextFromFile rtff=new ReadTextFromFile();
        String originalText=rtff.readFromFile(originalFilePath);//原文
        String analysisedText = ToAnalysis.parse(originalText).recognition(filter).toStringWithOutNature();
        System.out.println((analysisedText));
    }
}
