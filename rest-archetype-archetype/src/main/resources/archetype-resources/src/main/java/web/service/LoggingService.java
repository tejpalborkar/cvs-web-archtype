#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.service;

import java.util.List;

import ${package}.web.dto.LoggingInfo;

public interface LoggingService {

	void save(LoggingInfo loggingInfo);

	List<LoggingInfo> getAll();

}
