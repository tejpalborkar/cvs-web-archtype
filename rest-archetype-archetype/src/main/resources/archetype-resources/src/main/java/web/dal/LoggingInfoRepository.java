#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ${package}.web.dto.LoggingInfo;

@Repository
public interface LoggingInfoRepository extends CrudRepository<LoggingInfo, Long> {

}
