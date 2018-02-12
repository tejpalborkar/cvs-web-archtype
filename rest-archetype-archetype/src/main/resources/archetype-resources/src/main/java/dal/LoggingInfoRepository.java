#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ${package}.dto.LoggingInfo;

@Repository
public interface LoggingInfoRepository extends CrudRepository<LoggingInfo, Long> {

}
