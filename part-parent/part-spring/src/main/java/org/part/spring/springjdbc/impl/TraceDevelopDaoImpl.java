package org.part.spring.springjdbc.impl;

import org.part.spring.commutils.JdbcTemplateUtils;
import org.part.spring.pojo.TraceDevelopPo;
import org.part.spring.springjdbc.TraceDevelopDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class TraceDevelopDaoImpl implements TraceDevelopDao {

	private JdbcTemplate jdbcTemplate;
	private String INSERT_TRACE_DEVELOP_SQL="insert  into trace_develop(trace_file_name,file_create_time,file_last_update_time,file_type,file_size) values (?,?,?,?,?)";
	public int insert(TraceDevelopPo traceDevelopPo) {
		
		jdbcTemplate = JdbcTemplateUtils.getSpringJdbcTemplate(jdbcTemplate);
	    int count = jdbcTemplate.update(INSERT_TRACE_DEVELOP_SQL,
	    		traceDevelopPo.getTraceFileName(),
	    		traceDevelopPo.getFileCreateTime(),
	    		traceDevelopPo.getFileLastUpdateTime(),
	    		traceDevelopPo.getFileType(),
	    		traceDevelopPo.getFileSize());
		return count;
	}

}
