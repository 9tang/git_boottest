package com.demo.rabbitmq;

import java.util.ArrayList;
import java.util.List;

public class Test {

    static class OOMObject {
        public byte[] placeholder = new byte[1024 * 1024];
    }

    public static void fileHeap(int num) throws Exception{
        List<OOMObject> list = new ArrayList<>();
        for (int i=0; i < num; i++){
            Thread.sleep(40);
            list.add(new OOMObject());
            System.out.println(i);
        }
        System.gc();
    }

    public static void main(String[] args) throws Exception{
        fileHeap(1000);
    }
}
