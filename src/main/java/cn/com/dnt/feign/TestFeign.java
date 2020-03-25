package cn.com.dnt.feign;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestBody;

public interface TestFeign {

    @RequestLine("GET api/v1/host/gggg")
    String test();

    @RequestLine("POST api/v1/host/gggg1")
    @Headers("Content-Type: application/json")
    HostFileSystemInfoVo test1(@RequestBody HostFileSystemInfoVo vo);

    @RequestLine("PATCH /api/v3/instances/domains/{domain}")
    @Headers("Content-Type: application/json")
    String update(@Param("domain") String domainName, String content);
}
