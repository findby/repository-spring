package org.part.spring.job;

import org.part.spring.App;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
/***
 * @author	wenxiang.fei
 * @Description	Quartz 业务逻辑实现
 * @time	2019-11-28 14:21:24
 */
public class HelloQuartz implements Job {
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		App.insert();
	}
	
//	public void execute(JobExecutionContext context) throws JobExecutionException {
//        //创建工作详情
//        JobDetail detail=context.getJobDetail();
//        //获取工作的名称
//        String name=detail.getJobDataMap().getString("jobName");
//        String job=detail.getKey().getGroup();
//        String defaultDateToStr = DateUtils.simpleDateToStr(new Date());
//        System.out.println("任务调度：组："+job+",工作名："+name+"---->今日"+defaultDateToStr+"抢购，不容错过！");
//	}

}
