#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.dto.LoggingInfo;

public interface LoggingInfoDal {

	void save(LoggingInfo loggingInfo);

}
