package bean;

import java.util.Date;

public class passage {
    private  String id; //没有业务意义
    private  String name; // 乘客姓名
    private  String passageType; // 乘客类型
    private  String phone; //乘客电话号码
    private  String cardId; //乘客身份证号
    private Date birthday; //乘客出生日期

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public passage(String passageType) {
        this.passageType = passageType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public passage(Date birthday) {
        this.birthday = birthday;
    }
}
