package cn.com.dnt.feign.pds;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Domain {

    @JsonProperty("new_domain_name")
    @JSONField(name="new_domain_name")
    private String domainName;
    @JsonProperty("domain_info")
    @JSONField(name="domain_info")
    private String domainInfo;

    public Domain() {
    }

    public Domain(String domainName, String domainInfo) {
        this.domainName = domainName;
        this.domainInfo = domainInfo;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getDomainInfo() {
        return domainInfo;
    }

    public void setDomainInfo(String domainInfo) {
        this.domainInfo = domainInfo;
    }
}
