#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.service;

import ${package}.web.dto.LoggingInfo;

public interface LoggingInfoDal {

	void save(LoggingInfo loggingInfo);

}
