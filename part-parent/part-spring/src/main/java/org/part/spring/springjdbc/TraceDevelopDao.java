package org.part.spring.springjdbc;

import org.part.spring.pojo.TraceDevelopPo;
/***
 * @author	wenxiang.fei
 * @Description	记录资料轨迹的Dao接口
 * @time	2019-11-28 15:15:56
 */
public interface TraceDevelopDao {

	/***
	 * 数据库插入轨迹记录
	 * @param traceDevelopPo
	 * @return
	 */
	int insert(TraceDevelopPo traceDevelopPo);
}
