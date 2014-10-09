package com.vip.logger.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vip.logger.entity.SceLogger;

@Repository
public interface SceLoggerDao {

	public SceLogger findSceLoggerList(Long id);

	public List<SceLogger> findAllSceLoggers();

}
