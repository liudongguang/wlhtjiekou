package com.ldg.api;

/**
 * Created by LiuDongguang on 2017/4/19.
 */
public interface SysConstant {
    String DEFAULT_HEADIMG="assets/images/rongyunHead.png";
    String PAGE_REQUEST_ATTR="page";
    int PEONYMSG_SUCCESS_CODE=301;
    int ResultMsg_FAIL_PHONEERR=7;
    int ResultMsg_FAIL_CODE=1;
    String ResultMsg_SUCCESS="success";
    String ResultMsg_FAIL="fail";

    int MANAGER_TOKENVALIDE=100;//token失效
    String MANAGER_TOKENVALIDE_MSG="请重新登陆！";
    String UPLOADE_JPG_suffix=".jpg";
    String UPLOADE_FOLDER_zixunimgs="zixunimgs";

    String UPLOADE_JPG_Name="myjpg";
    int UPLOADE_fmtpstate=1; //封面图状态
    int Tempimages_STATE_TEMP=0;//图片暂存状态，只存1天
    String SYS_semicolon=";";

    String SYS_DOCTOR_STATE="_doctorAPP";


    int DEVICE_LAND_CHUJIE=1;//出借
    int DEVICE_LAND_RETURN=2;//归还
    int DEVICE_LAND_REPLACE=3;//替换

    int DeviceRepertory_DESTROY_NO=1; //未销毁
    int DeviceRepertory_DESTROY_YES=2;//已销毁

    String HighchartsConfig_NULLTITLE="未测量";
    int Statistics_DAYS_WEEK=7;
    int Statistics_DAYS_MONTH=30;

    int ACCEPT_DATA_TYPE_KK=1;//康康
    int ACCEPT_DATA_TYPE_SD=2;//手动
}
