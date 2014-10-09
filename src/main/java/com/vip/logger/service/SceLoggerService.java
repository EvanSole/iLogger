package com.vip.logger.service;

import java.util.List;

import com.vip.logger.entity.SceLogger;

public interface SceLoggerService {

	public SceLogger findSceLoggerList(Long id);
	
	public List<SceLogger> findAllSceLoggers();
	
}
