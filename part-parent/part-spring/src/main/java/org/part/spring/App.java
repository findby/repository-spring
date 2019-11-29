package org.part.spring;

import java.io.File;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.part.spring.pojo.TraceDevelopPo;
import org.part.spring.springjdbc.TraceDevelopDao;
import org.part.spring.springjdbc.impl.TraceDevelopDaoImpl;


public class App 
{
	public static void insert() {
    	TraceDevelopDao dao=new TraceDevelopDaoImpl();
		//读取学习目录地址
		File f=new File("E:/dubbo-down");
		File[] listFiles = f.listFiles();
		
		for (File file : listFiles) {
			//选择文件夹
			if(file.isDirectory()) {
				TraceDevelopPo traceDevelopPo = new TraceDevelopPo();
				traceDevelopPo.setTraceFileName(file.getName());
				traceDevelopPo.setFileCreateTime(new Date());
				traceDevelopPo.setFileLastUpdateTime(new Date());
				traceDevelopPo.setFileSize(0);
				//把记录插入数据库
				dao.insert(traceDevelopPo);
			}
			//选择文件
			else if(file.isFile()) {
				TraceDevelopPo traceDevelopPo = new TraceDevelopPo();
				traceDevelopPo.setTraceFileName(file.getName());
				traceDevelopPo.setFileCreateTime(new Date());
				traceDevelopPo.setFileLastUpdateTime(new Date());
				traceDevelopPo.setFileSize(1);
				traceDevelopPo.setFileType("文件");
//				String[] split = file.getName().split(".");
//				if("txt".equals(split[1])||"pdf".equals(split[1])||"doc".equals(split[1])) {
//					traceDevelopPo.setFileType(split[1]+"文档");
//				}else{
//					traceDevelopPo.setFileType(split[1]+"文件");
//				}
				
				//把记录插入数据库
				dao.insert(traceDevelopPo);
			}
		}
	}
    public static void main( String[] args )
    {
    	insert();
    }

}
class TimeThread implements Runnable{

	public void run() {
		showTime();
	}
    public void showTime() {
    	TimerTask task = new TimerTask() {

			@Override
			public void run() {
			}
    		
    	};
    	int period = 1 * 1000;//执行程序的间隔时间
    	Timer timer=new Timer();
    	timer.schedule(task, period);
    }
}
