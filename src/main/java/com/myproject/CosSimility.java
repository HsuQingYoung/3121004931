package com.myproject;

import org.ansj.recognition.impl.StopRecognition;
import org.ansj.splitWord.analysis.ToAnalysis;

import java.util.*;

public class CosSimility {
    public static double getCosSimility(String str1,String str2){
                StopRecognition filter = new StopRecognition();
                //过滤掉标点
                filter.insertStopNatures("w");
                //分词-统计词频
                Map<String,Integer> map1= new HashMap<>();
                ToAnalysis.parse(str1).recognition(filter).forEach(item -> {
                    //没有则赋初始值，有则+1
                    if (map1.get(item.getName()) == null){
                        map1.put(item.getName(),1);
                    }else {
                        map1.put(item.getName(),map1.get(item.getName())+1);
                    }
                });
                Map<String,Integer> map2 = new HashMap<>();
                ToAnalysis.parse(str2).recognition(filter).forEach(item -> {
                    //没有则赋初始值，有则+1
                    if (map2.get(item.getName()) == null){
                        map2.put(item.getName(),1);
                    }else {
                        map2.put(item.getName(),map2.get(item.getName())+1);
                    }
                });
                Set<String> set1 = map1.keySet();
                Set<String> set2 = map2.keySet();
                Set<String> setAll = new HashSet<>();
                setAll.addAll(set1);
                setAll.addAll(set2);
                List<Integer> list1 = new ArrayList<>(setAll.size());
                List<Integer> list2 = new ArrayList<>(setAll.size());
                //构建向量
                setAll.forEach(item ->{
                    if (set1.contains(item)){
                        list1.add(map1.get(item));
                    }else {
                        list1.add(0);
                    }

                    if (set2.contains(item)){
                        list2.add(map2.get(item));
                    }else {
                        list2.add(0);
                    }
                });
                //计算余弦相似度
                int sum =0;
                long sq1 = 0;
                long sq2 = 0;
                double result = 0;
                for (int i =0;i<setAll.size();i++){
                    sum +=list1.get(i)*list2.get(i);
                    sq1 += list1.get(i)*list1.get(i);
                    sq2 += list2.get(i)*list2.get(i);
                }
                result = sum/(Math.sqrt(sq1)*Math.sqrt(sq2));
                return result;

            }
        }


