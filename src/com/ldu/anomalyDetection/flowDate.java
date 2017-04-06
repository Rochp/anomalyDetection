package com.ldu.anomalyDetection;
//这是流量数据类，是网络发过来的流量对象（数据接收后转换的格式）
//一条流量数据是一个对象
public class flowDate {
	
	private String webSiteName;	//网站名
	private int flowCount;		//流量数
	private String time;		//统计时间
	
	public flowDate(String webSiteName,int flowCount,String time) {
		this.webSiteName=webSiteName;
		this.flowCount=flowCount;
		this.time=time;
		//连接数据库
		
	}
	
	//检测数据库中有没有表名为webSIteName的数据表
	public boolean checkIfTable(){
		boolean table = true;
		
		return table;
		
	}
	
	//创建表名为webSiteName的数据表
	
	//将数据存取到对应的数据库
	
	//获取数据库中的相应的数据同时将其放入算法中进行检测
	
	//运行异常检测算法
	
	
	
}
