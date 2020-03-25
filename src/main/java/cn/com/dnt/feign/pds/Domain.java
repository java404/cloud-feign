package cn.com.dnt.feign.pds;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Domain {
    private String domain_name;
    private String domain_info;

    public Domain() {
    }

    public Domain(String domain_name, String domain_info) {
        this.domain_name = domain_name;
        this.domain_info = domain_info;
    }

    public String getDomain_name() {
        return domain_name;
    }

    public void setDomain_name(String domain_name) {
        this.domain_name = domain_name;
    }

    public String getDomain_info() {
        return domain_info;
    }

    public void setDomain_info(String domain_info) {
        this.domain_info = domain_info;
    }
}
