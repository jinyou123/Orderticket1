package bean;

import javax.swing.text.Style;

public class Flight {
    private String cfd;//出发地
    private String mdd;//目的地
    private String cfsj;//出发时间
    private String planeType; //飞机类型
    private  String  setNo;
    private String setNum;

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

    public String getSetNo() {
        return setNo;
    }

    public void setSetNo(String setNo) {
        this.setNo = setNo;
    }

    public String getSetNum() {
        return setNum;
    }

    public void setSetNum(String setNum) {
        this.setNum = setNum;
    }
}
