package org.apache.dubbo.demo.provider;

import java.io.IOException;
import java.util.Date;

import org.apache.dubbo.common.utils.DateUtils;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloQuartz implements Job {

	public void execute(JobExecutionContext context) throws JobExecutionException {
		String simpleDateToStr = DateUtils.simpleDateToStr(new Date());
		System.out.println(simpleDateToStr);
		try {
			Runtime.getRuntime().exec("clear");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
