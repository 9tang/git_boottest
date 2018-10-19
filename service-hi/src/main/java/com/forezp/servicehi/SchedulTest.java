package com.forezp.servicehi;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
@Component
@EnableScheduling
public class SchedulTest {

//    @Scheduled(fixedRate = 5000)
//    public void resporttest(){
//        try {
//            Thread.sleep(1);
//            System.out.println(Thread.currentThread()+ "=schedul task time:" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
//        } catch (Exception e){
//
//        }
//    }
//
//    @Scheduled(cron = "0/2 * *  * * *")
//    public void reportCurrentByCron(){
//        System.out.println (Thread.currentThread()+ "=Scheduling Tasks Examples By Cron: The time is now " +  new SimpleDateFormat("HH:mm:ss").format (new Date ()));
//    }
//    @Scheduled(fixedDelay = 3000)
//    public void resporttes3t(){
//        try {
//            Thread.sleep(1);
//            System.out.println(Thread.currentThread()+ "=schedul3:" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
//        } catch (Exception e){
//
//        }

 //   }

}
