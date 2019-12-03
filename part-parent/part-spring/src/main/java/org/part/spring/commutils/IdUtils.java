package org.part.spring.commutils;

import java.util.UUID;
/***
 * @author	wenxiang.fei
 * @Description	uuid生成工具
 * @time	2019-12-03 10:16:01
 */
public class IdUtils {
	/***
	 * @return 获取去"-"的uuid
	 */
	public static String getUuid() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replaceAll("-", "");
	}
}
