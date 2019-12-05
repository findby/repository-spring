package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		return "hello "+ name;
	}

}
