package com.xf.proxy;
/***
 * @time	2019-10-18 13:39:50
 * @author	wenxiang.fei
 * @Description	主题类
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("主题类展示");
	}

}
