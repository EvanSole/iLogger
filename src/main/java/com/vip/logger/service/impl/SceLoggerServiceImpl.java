package com.vip.logger.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vip.logger.dao.SceLoggerDao;
import com.vip.logger.entity.SceLogger;
import com.vip.logger.service.SceLoggerService;

@Service
public class SceLoggerServiceImpl implements SceLoggerService {

	@Autowired
	private SceLoggerDao sceLoggerDao;

	@Override
	public SceLogger findSceLoggerList(Long id) {
		return sceLoggerDao.findSceLoggerList(id);
	}

	@Override
	public List<SceLogger> findAllSceLoggers() {
		return sceLoggerDao.findAllSceLoggers();
	}

}
