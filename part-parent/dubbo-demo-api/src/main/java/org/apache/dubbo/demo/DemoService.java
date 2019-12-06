package org.apache.dubbo.demo;

public interface DemoService {
	String sayHello(String name);
	/***
	 * 显示实时时间
	 * @param timeStr
	 */
	void showTime();
}
