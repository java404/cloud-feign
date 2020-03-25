package cn.com.dnt.feign.pds;

import feign.Body;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface PdsFeign {
    @RequestLine(value = "GET /api/v3/login?record={record}")
    @Headers("Content-Type: application/json")
    String login(@Param("record")String record);

    @RequestLine("GET /api/v3/instances/domains")
    @Headers("Content-Type: application/json")
    String domains();

    @RequestLine("POST /api/v3/instances/domains")
    @Headers("Content-Type: application/json")
    String add(String content);


    @RequestLine("DELETE /api/v3/instances/domains/{domain}")
    String del(@Param("domain") String domainName);

    @RequestLine("PATCH /api/v3/instances/domains/{domain_name}")
    @Headers("Content-Type: application/json")
    String update(@Param("domain_name") String domainName,String newDomain);

    @RequestLine("PATCH /api/v3/instances/cluster")
    @Headers("Content-Type: application/json")
    String updateCluster(String newCluster);
}
