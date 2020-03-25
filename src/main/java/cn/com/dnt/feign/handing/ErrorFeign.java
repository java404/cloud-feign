package cn.com.dnt.feign.handing;

import feign.RequestLine;

public interface ErrorFeign {
    @RequestLine("GET api/v1/host/ggggff")
    String test();
}
