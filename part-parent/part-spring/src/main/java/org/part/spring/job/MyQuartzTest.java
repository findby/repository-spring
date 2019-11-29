//package org.part.spring.job;
//
//import org.quartz.JobBuilder;
//import org.quartz.JobDetail;
//import org.quartz.Scheduler;
//import org.quartz.SimpleScheduleBuilder;
//import org.quartz.Trigger;
//import org.quartz.TriggerBuilder;
//import org.quartz.impl.StdSchedulerFactory;
//
//public class MyQuartzTest {
//	public static void main(String[] args) {
//		fun1();
//	}
//	
//	public static void fun1() {
//		try {
//			//调度
//			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
//			//触发的条件
//			Trigger trigger=TriggerBuilder.newTrigger()
//					.withIdentity("name1","group1")//name group
//					.startNow()//表示加入scheduler立即触发
//					.withSchedule(SimpleScheduleBuilder.simpleSchedule()
//							.withIntervalInSeconds(1)//每秒进行一次
//							.repeatForever())
//					.build();
//			JobDetail job = JobBuilder.newJob(HelloQuartz.class)//HelloQuartz实现逻辑
//					.withIdentity("name1", "group1")//name group
//					.usingJobData("jobName", "aaa")
//					.build();
//			scheduler.scheduleJob(job, trigger);
//			scheduler.start();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//}
