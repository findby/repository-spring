package org.part.spring.pojo;

import org.springframework.stereotype.Component;

/***
 * @author	wenxiang.fei
 * @Description	[一句话描述该类的功能]
 * @time	2019-11-27 15:58:40
 */
@Component
public class Bpojo {
	private Integer age;
	private String bno;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getBno() {
		return bno;
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
	
}
