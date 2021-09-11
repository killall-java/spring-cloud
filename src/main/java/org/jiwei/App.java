package org.jiwei;

import java.util.*;

/**
 * 动态规划题
 */
public class App {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int count =0;
        List<Integer> list = new ArrayList<>();
//        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
//            int a = in.nextInt();
//            list.add(a);
//        }
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(22);list.add(23);

        Collections.sort(list);
        HashMap<String,Integer> exist = new HashMap<String,Integer>();
        // 两个加数的情况
        for(int i=0;i<list.size();i++){
            int one = list.get(i);
            for(int j=i+1;j<list.size();j++){
                int two = list.get(j);
                if(one+two ==24){
                    if(exist.containsKey(one+" "+two)){

                    } else {
                        count++;
                        exist.put(one+" "+two,1);
                    }
                    break;
                }
            }
        }
        // 三个加数的情况
        for(int i=0;i<list.size();i++){
            int one = list.get(i);
            for(int j=i+1;j<list.size();j++){
                int two = list.get(j);
                for(int k=j+1;k<list.size();k++){
                    int three = list.get(k);
                    if(one+two+three ==24){
                        if(exist.containsKey(one+" "+two +" " +three)){

                        } else {
                            count++;
                            exist.put(one+" "+two +" " +three,1);
                        }
                    }
                }
            }
        }
        // 四个加数的情况
        for(int i=0;i<list.size();i++){
            int one = list.get(i);
            for(int j=i+1;j<list.size();j++){
                int two = list.get(i);
                for(int k=j+1;k<list.size();k++){
                    int three = list.get(k);
                    for(int a=k+1;a<list.size();a++){
                        int four = list.get(a);
                        if(one+two+three+four ==24){
                            if(exist.containsKey(one+" "+two +" " +three+""+four)){

                            } else {
                                count++;
                                exist.put(one+" "+two +" " +three+""+four,1);
                            }
                            break;
                        }
                    }
                }
            }
        }
        // 五个加数的情况
        for(int i=0;i<list.size();i++){
            int one = list.get(i);
            for(int j=i+1;j<list.size();j++){
                int two = list.get(i);
                for(int k=j+1;k<list.size();k++){
                    int three = list.get(k);
                    for(int a=k+1;a<list.size();a++){
                        int four = list.get(a);
                        for(int b=k+1;b<list.size();b++){
                            int five = list.get(b);
                            if(one+two+three+four+five ==24){
                                if(exist.containsKey(one+" "+two +" " +three+""+four+""+five)){

                                } else {
                                    count++;
                                    exist.put(one+" "+two +" " +three+""+four+""+five,1);
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
