package bean;

import javax.swing.text.Style;

public class Flight {
    private  String id;
    private String planeType; //飞机类型
    private int currentSeatsNum; //飞机座位数
    private String cfd;//出发地
    private String mdd;//目的地
    private String cfsj;//出发时间



    public Flight(String id, String cfd, String mdd, String cfsj, String planeType, int currentSeatsNum, String setNum) {
        this.id = id;
        this.cfd = cfd;
        this.mdd = mdd;
        this.cfsj = cfsj;
        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
    }

    public Flight(String id, String cdf, String mmd, String cfsj, String planeType, String currentSeatsNum) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCfd() {
        return cfd;
    }

    public void setCfd(String cfd) {
        this.cfd = cfd;
    }

    public String getMdd() {
        return mdd;
    }

    public void setMdd(String mdd) {
        this.mdd = mdd;
    }

    public String getCfsj() {
        return cfsj;
    }

    public void setCfsj(String cfsj) {
        this.cfsj = cfsj;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

}
