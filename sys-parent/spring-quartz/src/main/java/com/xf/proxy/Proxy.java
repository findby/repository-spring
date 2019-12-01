package com.xf.proxy;
/**
 * @author	wenxiang.fei
 * @Description	主题的代理类
 * @time	2019-10-18 14:09:27
 */
public class Proxy implements Subject{

	private RealSubject realSubject;
	
	@Override
	public void request() {
		if(realSubject==null) {
			realSubject=new RealSubject();
		}
		preRequest();
		realSubject.request();
		afterRequest();
	}
	private void preRequest() {
		System.out.println("代理前...");
	}
	private void afterRequest() {
		System.out.println("代理前...");
	}
	
}
