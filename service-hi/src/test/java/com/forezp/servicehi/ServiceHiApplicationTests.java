package com.forezp.servicehi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceHiApplicationTests {

    @Test
    public void contextLoads() {
        Arrays.asList( "p", "k", "u","f", "o", "r","k").forEach(e -> System.out.println( e ) );
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do" + Thread.currentThread());
            }
        }).start();
       new Thread(() -> System.out.println(Thread.currentThread() + "java8")).start();

//                (params) -> statement
//                (params) -> { statements }
    }

}
