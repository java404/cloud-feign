package cn.com.dnt.feign.ribbon;

import feign.Feign;

public class TestRibbon {
    public static void main(String[] args) {
        String api = Feign.builder()
                //.client(RibbonClient.create())
                .target(String.class, "http://localhost:8885");
    }
}
