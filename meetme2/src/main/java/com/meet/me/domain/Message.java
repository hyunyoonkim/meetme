package com.meet.me.domain;

import java.sql.Date;

public class Message {
	private int SENDER_ID;
	private int RECEIVER_ID;
	private String CONTENT;
	private Date SENT_DATE;
	private int MSG_CHECK;
	
	// -----DB에 없는거
	private String sender_name;
	private String receiver_name;
	
	public String getSender_name() {
		return sender_name;
	}
	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}
	public String getReceiver_name() {
		return receiver_name;
	}
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}
	public int getSENDER_ID() {
		return SENDER_ID;
	}
	public void setSENDER_ID(int sENDER_ID) {
		SENDER_ID = sENDER_ID;
	}
	public int getRECEIVER_ID() {
		return RECEIVER_ID;
	}
	public void setRECEIVER_ID(int rECEIVER_ID) {
		RECEIVER_ID = rECEIVER_ID;
	}
	public String getCONTENT() {
		return CONTENT;
	}
	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}
	public Date getSENT_DATE() {
		return SENT_DATE;
	}
	public void setSENT_DATE(Date sENT_DATE) {
		SENT_DATE = sENT_DATE;
	}
	public int getMSG_CHECK() {
		return MSG_CHECK;
	}
	public void setMSG_CHECK(int mSG_CHECK) {
		MSG_CHECK = mSG_CHECK;
	}
	
	
}
