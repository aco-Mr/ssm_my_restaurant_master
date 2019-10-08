package com.aco.my.restaurant.staff.dto;

/**
 * @ClassName: StaffDto
 * @Description: TODO
 * @Author: ww
 * @Date: 2019/9/24 15:12
 * @Version: 1.0.0
 */
public class StaffDto {
    private Integer sid;
    private String sname;
    private String ssex;
    private Integer sage;
    private Long phone;
    private Long scardid;
    private Integer did;
    private String saddress;
    private String shiredate;
    private Integer state;
    private String exitDate;

    public StaffDto() {
    }

    public StaffDto(Integer sid, String sname, String ssex, Integer sage, Long phone, Long scardid, Integer did, String saddress, String shiredate, Integer state, String exitDate) {
        this.sid = sid;
        this.sname = sname;
        this.ssex = ssex;
        this.sage = sage;
        this.phone = phone;
        this.scardid = scardid;
        this.did = did;
        this.saddress = saddress;
        this.shiredate = shiredate;
        this.state = state;
        this.exitDate = exitDate;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Long getScardid() {
        return scardid;
    }

    public void setScardid(Long scardid) {
        this.scardid = scardid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getShiredate() {
        return shiredate;
    }

    public void setShiredate(String shiredate) {
        this.shiredate = shiredate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getExitDate() {
        return exitDate;
    }

    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }

    @Override
    public String toString() {
        return "StaffDto{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", sage=" + sage +
                ", phone=" + phone +
                ", scardid=" + scardid +
                ", did=" + did +
                ", saddress='" + saddress + '\'' +
                ", shiredate='" + shiredate + '\'' +
                ", state=" + state +
                ", exitDate='" + exitDate + '\'' +
                '}';
    }
}
