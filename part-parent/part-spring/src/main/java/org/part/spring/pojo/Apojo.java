package org.part.spring.pojo;

import org.springframework.stereotype.Component;

/***
 * @author	wenxiang.fei
 * @Description	[一句话描述该类的功能]
 * @time	2019-11-27 15:56:58
 */
@Component
public class Apojo {
	
	private String name;
	private String ano;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
}
