package com.libi;

import com.libi.biz.StatTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        StatTask statTask = context.getBean(StatTask.class);  // 获取逻辑入口类的实例
        statTask.starTask();
    }
}
