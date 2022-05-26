package com.libi.biz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.security.acl.LastOwnerException;

@Component
@Slf4j
public class StatTask {
    /**
     * 脚本开始
     */
    public void starTask() {
        log.info("开始执行");
    }
}
