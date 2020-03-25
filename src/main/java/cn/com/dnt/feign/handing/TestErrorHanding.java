package cn.com.dnt.feign.handing;

import com.sun.org.apache.regexp.internal.RE;
import feign.Feign;
import feign.Response;
import feign.codec.ErrorDecoder;

public class TestErrorHanding {
    public static void main(String[] args) {
        final ErrorFeign target = Feign.builder()
                .errorDecoder(new FeignErrorDecoder())
                .target(ErrorFeign.class, "http://localhost:8885");

        final String test = target.test();
        System.out.println(test);
    }
}
