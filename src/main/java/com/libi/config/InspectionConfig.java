package com.libi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.concurrent.*;

/**
 * @author :Libi
 * @version :1.0
 * @date :2020-06-19 14:06
 * 用于巡检相关的Bean和会配置在这里
 */
@Configuration
public class InspectionConfig {

    /**
     * 因为巡检相关的操作还需要异步完成，同一时间最多只接受一个活跃的巡检任务，
     * 以避免监管系统错误的频繁请求导致受监管链消耗大量的资源用于响应巡检需求
     */
    @Bean
    public ThreadPoolExecutor inspectionExecutorThreadPoll() {
        //核心线程
        int corePoolSize = 32;
        //最大线程
        int maxPoolSize = 32;
        //临时工无事可干的时间(ms)
        int aliveTime = 1000;
        //队列大小
        int queueSize = Integer.MAX_VALUE;
        //这个是一个有界的队列，队列满之后线程池就会再次新建线程进行运行
        //但是这里最大线程数和核心线程数是一样大的，所以不会创建线程执行，直接抛出异常
        ArrayBlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<>(queueSize);
        //线程工厂的逻辑
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, "inspection-executor");
            }
        };
        //创建线程池
        return new ThreadPoolExecutor(corePoolSize, maxPoolSize, aliveTime, TimeUnit.MILLISECONDS, blockingQueue,threadFactory);
    }
}
