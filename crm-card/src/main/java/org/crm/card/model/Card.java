package org.crm.card.model;

import java.util.Date;
import javax.persistence.*;

public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "orgUnitNo")
    private String orgunitno;

    @Column(name = "cardId")
    private String cardid;

    @Column(name = "cardNo")
    private String cardno;

    @Column(name = "cardType")
    private String cardtype;

    /**
     * 通用代码（不可见），类型：cardstate，S-结存，I-持有，L-挂失，X-作废，O-过期
     */
    private String state;

    @Column(name = "resOrgUnitNo")
    private String resorgunitno;

    /**
     * 除【持有】外，其他状态时均为0
     */
    @Column(name = "memberId")
    private Integer memberid;

    /**
     * 过了此日期就将卡状态置为过期，只有不记名卡会有失效日期
     */
    @Column(name = "expireDate")
    private Date expiredate;

    private String remarks;

    @Column(name = "controlUnitNo")
    private String controlunitno;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return orgUnitNo
     */
    public String getOrgunitno() {
        return orgunitno;
    }

    /**
     * @param orgunitno
     */
    public void setOrgunitno(String orgunitno) {
        this.orgunitno = orgunitno;
    }

    /**
     * @return cardId
     */
    public String getCardid() {
        return cardid;
    }

    /**
     * @param cardid
     */
    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    /**
     * @return cardNo
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * @param cardno
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
     * @return cardType
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * @param cardtype
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    /**
     * 获取通用代码（不可见），类型：cardstate，S-结存，I-持有，L-挂失，X-作废，O-过期
     *
     * @return state - 通用代码（不可见），类型：cardstate，S-结存，I-持有，L-挂失，X-作废，O-过期
     */
    public String getState() {
        return state;
    }

    /**
     * 设置通用代码（不可见），类型：cardstate，S-结存，I-持有，L-挂失，X-作废，O-过期
     *
     * @param state 通用代码（不可见），类型：cardstate，S-结存，I-持有，L-挂失，X-作废，O-过期
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return resOrgUnitNo
     */
    public String getResorgunitno() {
        return resorgunitno;
    }

    /**
     * @param resorgunitno
     */
    public void setResorgunitno(String resorgunitno) {
        this.resorgunitno = resorgunitno;
    }

    /**
     * 获取除【持有】外，其他状态时均为0
     *
     * @return memberId - 除【持有】外，其他状态时均为0
     */
    public Integer getMemberid() {
        return memberid;
    }

    /**
     * 设置除【持有】外，其他状态时均为0
     *
     * @param memberid 除【持有】外，其他状态时均为0
     */
    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    /**
     * 获取过了此日期就将卡状态置为过期，只有不记名卡会有失效日期
     *
     * @return expireDate - 过了此日期就将卡状态置为过期，只有不记名卡会有失效日期
     */
    public Date getExpiredate() {
        return expiredate;
    }

    /**
     * 设置过了此日期就将卡状态置为过期，只有不记名卡会有失效日期
     *
     * @param expiredate 过了此日期就将卡状态置为过期，只有不记名卡会有失效日期
     */
    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return controlUnitNo
     */
    public String getControlunitno() {
        return controlunitno;
    }

    /**
     * @param controlunitno
     */
    public void setControlunitno(String controlunitno) {
        this.controlunitno = controlunitno;
    }
}