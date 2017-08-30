package com.chanshuyi;

import com.chanshuyi.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by chanshuyi on 2016/1/19.
 */
@Component
public class UserServiceConsumer {


    private static Logger logger = LoggerFactory.getLogger(UserServiceConsumer.class);

    public static void main(String args[]) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) ctx.getBean("userService");
        System.out.println("we are now at feature1");
        logger.info("执行结果：" + userService.login("hello", "hello"));
    }
}
