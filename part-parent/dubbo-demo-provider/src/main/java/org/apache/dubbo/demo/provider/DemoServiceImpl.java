package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.DemoService;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		return "hello "+ name;
	}

	public void showTime() {
		lineTime();
	}


	/***
	 * 
	 * @param clazz 业务操作类的.class
	 * @param intervalSeconds 定时任务间隔的秒钟
	 */
	private void lineTime(Class<T> clazz,Integer intervalSeconds) {
        try{
            //创建scheduler，执行计划
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            //定义一个Trigger,触发条件类
            Trigger trigger = TriggerBuilder.newTrigger().
                    withIdentity("trigger1", "group1") //定义name/group
                    .startNow()//一旦加入scheduler，立即生效
                   .withSchedule(SimpleScheduleBuilder.simpleSchedule() //使用SimpleTrigger
                           .withIntervalInSeconds(3) //每隔3秒执行一次
                           .repeatForever()) //一直执行，奔腾到老不停歇
                   .build();
           //定义一个JobDetail
           JobDetail job = JobBuilder.newJob(clazz) //定义Job类为HelloQuartz类，这是真正的执行逻辑所在
                   .withIdentity("job1", "group1") //定义name/group
                   .usingJobData("name", "quartz") //定义属性
                   .build();
           //加入这个调度
           scheduler.scheduleJob(job, trigger);
           //启动任务调度
           scheduler.start();
       }catch (Exception ex){
           ex.printStackTrace();
       }
	}

}
