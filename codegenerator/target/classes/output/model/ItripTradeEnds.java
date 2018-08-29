package cn.kgc.itrip.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ItripTradeEnds implements Serializable {

    //订单ID
    private Long id;
    //订单编号(注意非支付宝交易编号tradeNo)
    private String orderNo;
    //标识字段(默认0：未处理；1：处理中)
    private String flag;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getFlag() {
        return this.flag;
    }
}
