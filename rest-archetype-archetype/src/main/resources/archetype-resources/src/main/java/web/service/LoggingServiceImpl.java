#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${package}.web.dal.LoggingInfoRepository;
import ${package}.web.dto.LoggingInfo;


@Service
public class LoggingServiceImpl implements LoggingService {
	
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(LoggingServiceImpl.class);

	@Autowired
	private LoggingInfoRepository loggingInfoRepository;
	
	@Override
	public void save(LoggingInfo loggingInfo) {
		LOGGER.info("Entering save");
		loggingInfoRepository.save(loggingInfo);
	}

	@Override
	public List<LoggingInfo> getAll() {
		return  (List<LoggingInfo>) loggingInfoRepository.findAll();
	}

}
