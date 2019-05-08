package com.ssm.service;

import com.ssm.domain.SysLog;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ISysLogService {
    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll() throws Exception;
}
