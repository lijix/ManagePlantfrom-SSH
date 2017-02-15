package com.haifeiWu.entity;

import java.io.Serializable;
import java.sql.Blob;

/**
 * 进入人员基本信息表
 * 
 * @author wuhaifei
 * 
 * @String 2016年8月9日
 */
public class PHCSMP_Suspect implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5439411933114979140L;

	private int id;
	private String suspect_ID;// 档案编号（主键）
	private int band_ID;// 手环ID
	private String suspect_Name;// 姓名
	private String sex;// 性别
	private String birthday;// 出生日期
	private String nation;// 民族
	private String phone;// 手机号码
	private String type_ID;// 证件类型
	private String identifyCard_Number;// 证件号码
	private String suspected_Cause;// 进入办案区原因（案由字典表中ID用逗号分隔）
	private String enter_Time;// 进入办案区时间
	private String quit_time;// 离开信息登记室时间
	private String staff_ID;// 办案民警
	//此记录数据字典中没有，用来记录嫌疑人个人信息
	private String address;// 家庭住址
	private String now_address;// 家庭住址
	private int is_Active;// 是否激活（默认未激活0）
	private String tdentityID_Imag;// 身份证照片的base64码
	private String take_Picture;// 现场拍摄照片的url
	private int is_OutOf;// 是否出区，代表该嫌疑人是历史嫌疑人
	//用来记录填写完整度
	private int total_record;// 需要填写的总记录数
	private int fill_record;// 当前填写的记录数

	//wxy增加V1.2版本的字段
	private int process_Now;//当前所处的流程状态，对应PHCSMP_Dic_Process表中的Process_ID，整个流程结束后置为-1
	private int room_Now;//当前涉案人员所处的房间编号，对应PHCSMP_Room表中的Room_ID
	private Blob identityCard_Photo;//对应数据库中的Blob数据类型，用来存储身份证照片
	private String frontal_Photo;//正面照图像文件地址
	private String sideWays_Photo;//侧面照图像文件地址
	private int recordVideo_State;//录像状态，0：不进行录像1：录像还未启动2：录像已经启动3：录像结束
	private int is_RecordVideo_DownLoad;//录像文件是否下载成功，0没有下载成功，1下载成功
	
	
	
	public Blob getIdentityCard_Photo() {
		return identityCard_Photo;
	}

	public void setIdentityCard_Photo(Blob identityCard_Photo) {
		this.identityCard_Photo = identityCard_Photo;
	}

	public int getProcess_Now() {
		return process_Now;
	}

	public void setProcess_Now(int process_Now) {
		this.process_Now = process_Now;
	}

	public int getRoom_Now() {
		return room_Now;
	}

	public void setRoom_Now(int room_Now) {
		this.room_Now = room_Now;
	}

	public String getFrontal_Photo() {
		return frontal_Photo;
	}

	public void setFrontal_Photo(String frontal_Photo) {
		this.frontal_Photo = frontal_Photo;
	}

	public String getSideWays_Photo() {
		return sideWays_Photo;
	}

	public void setSideWays_Photo(String sideWays_Photo) {
		this.sideWays_Photo = sideWays_Photo;
	}

	public int getRecordVideo_State() {
		return recordVideo_State;
	}

	public void setRecordVideo_State(int recordVideo_State) {
		this.recordVideo_State = recordVideo_State;
	}

	public int getIs_RecordVideo_DownLoad() {
		return is_RecordVideo_DownLoad;
	}

	public void setIs_RecordVideo_DownLoad(int is_RecordVideo_DownLoad) {
		this.is_RecordVideo_DownLoad = is_RecordVideo_DownLoad;
	}

	public int getIs_OutOf() {
		return is_OutOf;
	}

	public void setIs_OutOf(int is_OutOf) {
		this.is_OutOf = is_OutOf;
	}

	public String getNow_address() {
		return now_address;
	}

	public void setNow_address(String now_address) {
		this.now_address = now_address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getSuspect_ID() {
		return suspect_ID;
	}

	public void setSuspect_ID(String suspect_ID) {
		this.suspect_ID = suspect_ID;
	}

	public String getEnter_Time() {
		return enter_Time;
	}

	public void setEnter_Time(String enter_Time) {
		this.enter_Time = enter_Time;
	}

	public String getTdentityID_Imag() {
		return tdentityID_Imag;
	}

	public void setTdentityID_Imag(String tdentityID_Imag) {
		this.tdentityID_Imag = tdentityID_Imag;
	}

	public String getTake_Picture() {
		return take_Picture;
	}

	public void setTake_Picture(String take_Picture) {
		this.take_Picture = take_Picture;
	}

	public int getIs_Active() {
		return is_Active;
	}

	public void setIs_Active(int is_Active) {
		this.is_Active = is_Active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBand_ID() {
		return band_ID;
	}

	public void setBand_ID(int band_ID) {
		this.band_ID = band_ID;
	}

	public String getSuspect_Name() {
		return suspect_Name;
	}

	public void setSuspect_Name(String suspect_Name) {
		this.suspect_Name = suspect_Name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getType_ID() {
		return type_ID;
	}

	public void setType_ID(String type_ID) {
		this.type_ID = type_ID;
	}

	public String getIdentifyCard_Number() {
		return identifyCard_Number;
	}

	public void setIdentifyCard_Number(String identifyCard_Number) {
		this.identifyCard_Number = identifyCard_Number;
	}

	public String getSuspected_Cause() {
		return suspected_Cause;
	}

	public void setSuspected_Cause(String suspected_Cause) {
		this.suspected_Cause = suspected_Cause;
	}

	public String getStaff_ID() {
		return staff_ID;
	}

	public void setStaff_ID(String staff_ID) {
		this.staff_ID = staff_ID;
	}

	public int getTotal_record() {
		return total_record;
	}

	public void setTotal_record(int total_record) {
		this.total_record = total_record;
	}

	public int getFill_record() {
		return fill_record;
	}

	public void setFill_record(int fill_record) {
		this.fill_record = fill_record;
	}

	@Override
	public String toString() {
		return this.suspect_ID + " " + this.suspect_Name + " " + this.sex;
	}

	public String getQuit_time() {
		return quit_time;
	}

	public void setQuit_time(String quit_time) {
		this.quit_time = quit_time;
	}

}
