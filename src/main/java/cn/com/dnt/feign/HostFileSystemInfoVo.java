package cn.com.dnt.feign;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HostFileSystemInfoVo {
  private String path; //文件系统路径
  private String avail;
  @JsonProperty("total_size")
  private String total; //总空间大小
  @JsonProperty("used_size")
  private String used; //使用空间
  @JsonProperty("usage_rate")
  private String usage; //使用率

  public HostFileSystemInfoVo() {
  }

  public HostFileSystemInfoVo(String path, String avail, String total, String used, String usage) {
    this.path = path;
    this.avail = avail;
    this.total = total;
    this.used = used;
    this.usage = usage;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getAvail() {
    return avail;
  }

  public void setAvail(String avail) {
    this.avail = avail;
  }

  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }

  public String getUsed() {
    return used;
  }

  public void setUsed(String used) {
    this.used = used;
  }

  public String getUsage() {
    return usage;
  }

  public void setUsage(String usage) {
    this.usage = usage;
  }

  @Override
  public String toString() {
    return "HostFileSystemInfo{" +
      "path='" + path + '\'' +
      ", avail='" + avail + '\'' +
      ", total='" + total + '\'' +
      ", used='" + used + '\'' +
      ", usage='" + usage + '\'' +
      '}';
  }
}
