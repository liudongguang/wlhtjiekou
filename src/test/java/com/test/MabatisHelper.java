package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by LiuDongguang on 2017/6/29.
 */
public class MabatisHelper {
    public static void main(String[] args) {
        /// (select #{obj.id},#{obj.name} from dual)
        String ss="baidentity,zzdm,zzname,banum,name,cyksbm,lyfs,Ylfs,Zycs,Sex,Birthday,Age_sui,Age_month,Age_days,Guoji,Xsecstizhong,Xserytizhong,Csd,Jiguan,Minzu,Idcard,Zhiye1,Hunyin,Xianzhuzhi,Xianyoubian,Hukoudz,Hukouyoubian,Workinfo,Dwtel,Dwyb,Lxrname,Lxrguanxi,Lxrdz,Lxrtel,Rylj,Rytime,Ryksbm,Cytime,Swsj,Xuexing,Rhxuexing,Binganzhiliang,Nijieshouyljgname,juzhuxingzheng,hukouquhua,ZLFQ,ZLFQM,ZLFQN,ZLFQT";
        List<String> collect = Arrays.asList(ss.split(",")).stream().map(item -> {
            StringBuilder sbd = new StringBuilder();
            item=item.toLowerCase();
            int index=item.indexOf("_");
            if(index!=-1){
               String[] arr=item.split("_");
               StringBuilder arrStr=new StringBuilder();
                arrStr.append(arr[0]);
               for(int i=1;i<arr.length;i++){
                   String str=arr[i];
                   arrStr.append(str.substring(0,1).toUpperCase()+str.substring(1));
               }
               item=arrStr.toString();
            }
            sbd.append("#{obj.").append(item).append("},");
            return sbd.toString();
        }).collect(Collectors.toList());
        System.out.println(collect.stream().collect(Collectors.joining()));
    }
}
