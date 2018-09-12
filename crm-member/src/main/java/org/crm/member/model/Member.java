package org.crm.member.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "orgUnitNo")
    private String orgunitno;

    private Integer pid;

    /**
     * 支持多语言，不记名会员会员姓名可以为''
     */
    private String name;

    @Column(name = "memberTypeId")
    private Integer membertypeid;

    @Column(name = "memberClassId")
    private Integer memberclassid;

    @Column(name = "shareSAcc")
    private Boolean sharesacc;

    @Column(name = "sharePAcc")
    private Boolean sharepacc;

    /**
     * 持有卡的卡编号，冗余以改善性能
     */
    @Column(name = "cardNo")
    private String cardno;

    @Column(name = "saccId")
    private Integer saccid;

    /**
     * 通用代码，类型：salute
     */
    private String salute;

    /**
     * 通用代码，类型：sex
     */
    private String sex;

    private Date birthday;

    /**
     * 格式：mm-dd，substring(convert(nvarchar, birthday, 120), 6, 5)
     */
    private String birthdate;

    @Column(name = "lunarBirthday")
    private String lunarbirthday;

    /**
     * 通用代码（不可见），类型：constellation
     */
    private String constellation;

    /**
     * 通用代码，类型：marriage
     */
    private String marriage;

    private String tel;

    private String cellphone;

    private String address;

    private String fax;

    private String zipcode;

    @Column(name = "userName")
    private String username;

    @Column(name = "userPass")
    private String userpass;

    private String email;

    private String qq;

    private String weixin;

    private String firm;

    @Column(name = "firmAddress")
    private String firmaddress;

    @Column(name = "firmTel")
    private String firmtel;

    /**
     * 通用代码，类型：career
     */
    private String career;

    /**
     * 通用代码，类型：duty
     */
    private String duty;

    @Column(name = "saleOrgUnitNo")
    private String saleorgunitno;

    @Column(name = "devOrgUnitNo")
    private String devorgunitno;

    @Column(name = "devOutletId")
    private Integer devoutletid;

    private Integer salesman;

    private Integer maintainer;

    private String inputer;

    @Column(name = "inputTime")
    private Date inputtime;

    private String modifier;

    @Column(name = "modifyTime")
    private Date modifytime;

    /**
     * 通用代码，类型：country
     */
    private String country;

    /**
     * 通用代码，类型：language
     */
    private String language;

    /**
     * 通用代码，类型：nation
     */
    private String nation;

    /**
     * 通用代码，类型：region
     */
    @Column(name = "nativePlace")
    private String nativeplace;

    /**
     * 通用代码，类型：region
     */
    @Column(name = "birthPlace")
    private String birthplace;

    private Integer height;

    private Integer weight;

    /**
     * 通用代码，类型：education
     */
    private String education;

    /**
     * 通用代码，类型：doctype
     */
    @Column(name = "docType")
    private String doctype;

    @Column(name = "docNo")
    private String docno;

    /**
     * 通用代码，类型：areatype
     */
    @Column(name = "areaType")
    private String areatype;

    /**
     * 通用代码，类型：region，末4位为0
     */
    private String province;

    /**
     * 通用代码，类型：region，末2位为0
     */
    private String city;

    /**
     * 通用代码，类型：region，其他
     */
    private String region;

    /**
     * 默认值为当前时间
     */
    @Column(name = "effectiveDate")
    private Date effectivedate;

    /**
     * 过了此日期就将会员状态置为暂停
     */
    @Column(name = "expireDate")
    private Date expiredate;

    @Column(name = "joinDate")
    private Date joindate;

    @Column(name = "referrerId")
    private Integer referrerid;

    @Column(name = "profileId")
    private Integer profileid;

    /**
     * 通用代码，类型：channel
     */
    private String channel;

    private String specials;

    @Column(name = "consumptionTotal")
    private BigDecimal consumptiontotal;

    @Column(name = "consumptionTimes")
    private Integer consumptiontimes;

    @Column(name = "consumptionGap")
    private Integer consumptiongap;

    @Column(name = "yearlyTimes")
    private Integer yearlytimes;

    @Column(name = "lastConsumptionDate")
    private Date lastconsumptiondate;

    @Column(name = "referenceTimes")
    private Integer referencetimes;

    /**
     * 通用代码（不可见），类型：memberstate，S-待审，I-未生效，A-有效，P-暂停，X-注销
     */
    private String state;

    private Boolean unsign;

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
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取支持多语言，不记名会员会员姓名可以为''
     *
     * @return name - 支持多语言，不记名会员会员姓名可以为''
     */
    public String getName() {
        return name;
    }

    /**
     * 设置支持多语言，不记名会员会员姓名可以为''
     *
     * @param name 支持多语言，不记名会员会员姓名可以为''
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return memberTypeId
     */
    public Integer getMembertypeid() {
        return membertypeid;
    }

    /**
     * @param membertypeid
     */
    public void setMembertypeid(Integer membertypeid) {
        this.membertypeid = membertypeid;
    }

    /**
     * @return memberClassId
     */
    public Integer getMemberclassid() {
        return memberclassid;
    }

    /**
     * @param memberclassid
     */
    public void setMemberclassid(Integer memberclassid) {
        this.memberclassid = memberclassid;
    }

    /**
     * @return shareSAcc
     */
    public Boolean getSharesacc() {
        return sharesacc;
    }

    /**
     * @param sharesacc
     */
    public void setSharesacc(Boolean sharesacc) {
        this.sharesacc = sharesacc;
    }

    /**
     * @return sharePAcc
     */
    public Boolean getSharepacc() {
        return sharepacc;
    }

    /**
     * @param sharepacc
     */
    public void setSharepacc(Boolean sharepacc) {
        this.sharepacc = sharepacc;
    }

    /**
     * 获取持有卡的卡编号，冗余以改善性能
     *
     * @return cardNo - 持有卡的卡编号，冗余以改善性能
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * 设置持有卡的卡编号，冗余以改善性能
     *
     * @param cardno 持有卡的卡编号，冗余以改善性能
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
     * @return saccId
     */
    public Integer getSaccid() {
        return saccid;
    }

    /**
     * @param saccid
     */
    public void setSaccid(Integer saccid) {
        this.saccid = saccid;
    }

    /**
     * 获取通用代码，类型：salute
     *
     * @return salute - 通用代码，类型：salute
     */
    public String getSalute() {
        return salute;
    }

    /**
     * 设置通用代码，类型：salute
     *
     * @param salute 通用代码，类型：salute
     */
    public void setSalute(String salute) {
        this.salute = salute;
    }

    /**
     * 获取通用代码，类型：sex
     *
     * @return sex - 通用代码，类型：sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置通用代码，类型：sex
     *
     * @param sex 通用代码，类型：sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取格式：mm-dd，substring(convert(nvarchar, birthday, 120), 6, 5)
     *
     * @return birthdate - 格式：mm-dd，substring(convert(nvarchar, birthday, 120), 6, 5)
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * 设置格式：mm-dd，substring(convert(nvarchar, birthday, 120), 6, 5)
     *
     * @param birthdate 格式：mm-dd，substring(convert(nvarchar, birthday, 120), 6, 5)
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return lunarBirthday
     */
    public String getLunarbirthday() {
        return lunarbirthday;
    }

    /**
     * @param lunarbirthday
     */
    public void setLunarbirthday(String lunarbirthday) {
        this.lunarbirthday = lunarbirthday;
    }

    /**
     * 获取通用代码（不可见），类型：constellation
     *
     * @return constellation - 通用代码（不可见），类型：constellation
     */
    public String getConstellation() {
        return constellation;
    }

    /**
     * 设置通用代码（不可见），类型：constellation
     *
     * @param constellation 通用代码（不可见），类型：constellation
     */
    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    /**
     * 获取通用代码，类型：marriage
     *
     * @return marriage - 通用代码，类型：marriage
     */
    public String getMarriage() {
        return marriage;
    }

    /**
     * 设置通用代码，类型：marriage
     *
     * @param marriage 通用代码，类型：marriage
     */
    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return cellphone
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * @return userName
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return userPass
     */
    public String getUserpass() {
        return userpass;
    }

    /**
     * @param userpass
     */
    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return qq
     */
    public String getQq() {
        return qq;
    }

    /**
     * @param qq
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * @return weixin
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * @param weixin
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    /**
     * @return firm
     */
    public String getFirm() {
        return firm;
    }

    /**
     * @param firm
     */
    public void setFirm(String firm) {
        this.firm = firm;
    }

    /**
     * @return firmAddress
     */
    public String getFirmaddress() {
        return firmaddress;
    }

    /**
     * @param firmaddress
     */
    public void setFirmaddress(String firmaddress) {
        this.firmaddress = firmaddress;
    }

    /**
     * @return firmTel
     */
    public String getFirmtel() {
        return firmtel;
    }

    /**
     * @param firmtel
     */
    public void setFirmtel(String firmtel) {
        this.firmtel = firmtel;
    }

    /**
     * 获取通用代码，类型：career
     *
     * @return career - 通用代码，类型：career
     */
    public String getCareer() {
        return career;
    }

    /**
     * 设置通用代码，类型：career
     *
     * @param career 通用代码，类型：career
     */
    public void setCareer(String career) {
        this.career = career;
    }

    /**
     * 获取通用代码，类型：duty
     *
     * @return duty - 通用代码，类型：duty
     */
    public String getDuty() {
        return duty;
    }

    /**
     * 设置通用代码，类型：duty
     *
     * @param duty 通用代码，类型：duty
     */
    public void setDuty(String duty) {
        this.duty = duty;
    }

    /**
     * @return saleOrgUnitNo
     */
    public String getSaleorgunitno() {
        return saleorgunitno;
    }

    /**
     * @param saleorgunitno
     */
    public void setSaleorgunitno(String saleorgunitno) {
        this.saleorgunitno = saleorgunitno;
    }

    /**
     * @return devOrgUnitNo
     */
    public String getDevorgunitno() {
        return devorgunitno;
    }

    /**
     * @param devorgunitno
     */
    public void setDevorgunitno(String devorgunitno) {
        this.devorgunitno = devorgunitno;
    }

    /**
     * @return devOutletId
     */
    public Integer getDevoutletid() {
        return devoutletid;
    }

    /**
     * @param devoutletid
     */
    public void setDevoutletid(Integer devoutletid) {
        this.devoutletid = devoutletid;
    }

    /**
     * @return salesman
     */
    public Integer getSalesman() {
        return salesman;
    }

    /**
     * @param salesman
     */
    public void setSalesman(Integer salesman) {
        this.salesman = salesman;
    }

    /**
     * @return maintainer
     */
    public Integer getMaintainer() {
        return maintainer;
    }

    /**
     * @param maintainer
     */
    public void setMaintainer(Integer maintainer) {
        this.maintainer = maintainer;
    }

    /**
     * @return inputer
     */
    public String getInputer() {
        return inputer;
    }

    /**
     * @param inputer
     */
    public void setInputer(String inputer) {
        this.inputer = inputer;
    }

    /**
     * @return inputTime
     */
    public Date getInputtime() {
        return inputtime;
    }

    /**
     * @param inputtime
     */
    public void setInputtime(Date inputtime) {
        this.inputtime = inputtime;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * @param modifier
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * @return modifyTime
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * @param modifytime
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    /**
     * 获取通用代码，类型：country
     *
     * @return country - 通用代码，类型：country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置通用代码，类型：country
     *
     * @param country 通用代码，类型：country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取通用代码，类型：language
     *
     * @return language - 通用代码，类型：language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置通用代码，类型：language
     *
     * @param language 通用代码，类型：language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 获取通用代码，类型：nation
     *
     * @return nation - 通用代码，类型：nation
     */
    public String getNation() {
        return nation;
    }

    /**
     * 设置通用代码，类型：nation
     *
     * @param nation 通用代码，类型：nation
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * 获取通用代码，类型：region
     *
     * @return nativePlace - 通用代码，类型：region
     */
    public String getNativeplace() {
        return nativeplace;
    }

    /**
     * 设置通用代码，类型：region
     *
     * @param nativeplace 通用代码，类型：region
     */
    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    /**
     * 获取通用代码，类型：region
     *
     * @return birthPlace - 通用代码，类型：region
     */
    public String getBirthplace() {
        return birthplace;
    }

    /**
     * 设置通用代码，类型：region
     *
     * @param birthplace 通用代码，类型：region
     */
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 获取通用代码，类型：education
     *
     * @return education - 通用代码，类型：education
     */
    public String getEducation() {
        return education;
    }

    /**
     * 设置通用代码，类型：education
     *
     * @param education 通用代码，类型：education
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * 获取通用代码，类型：doctype
     *
     * @return docType - 通用代码，类型：doctype
     */
    public String getDoctype() {
        return doctype;
    }

    /**
     * 设置通用代码，类型：doctype
     *
     * @param doctype 通用代码，类型：doctype
     */
    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    /**
     * @return docNo
     */
    public String getDocno() {
        return docno;
    }

    /**
     * @param docno
     */
    public void setDocno(String docno) {
        this.docno = docno;
    }

    /**
     * 获取通用代码，类型：areatype
     *
     * @return areaType - 通用代码，类型：areatype
     */
    public String getAreatype() {
        return areatype;
    }

    /**
     * 设置通用代码，类型：areatype
     *
     * @param areatype 通用代码，类型：areatype
     */
    public void setAreatype(String areatype) {
        this.areatype = areatype;
    }

    /**
     * 获取通用代码，类型：region，末4位为0
     *
     * @return province - 通用代码，类型：region，末4位为0
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置通用代码，类型：region，末4位为0
     *
     * @param province 通用代码，类型：region，末4位为0
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取通用代码，类型：region，末2位为0
     *
     * @return city - 通用代码，类型：region，末2位为0
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置通用代码，类型：region，末2位为0
     *
     * @param city 通用代码，类型：region，末2位为0
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取通用代码，类型：region，其他
     *
     * @return region - 通用代码，类型：region，其他
     */
    public String getRegion() {
        return region;
    }

    /**
     * 设置通用代码，类型：region，其他
     *
     * @param region 通用代码，类型：region，其他
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 获取默认值为当前时间
     *
     * @return effectiveDate - 默认值为当前时间
     */
    public Date getEffectivedate() {
        return effectivedate;
    }

    /**
     * 设置默认值为当前时间
     *
     * @param effectivedate 默认值为当前时间
     */
    public void setEffectivedate(Date effectivedate) {
        this.effectivedate = effectivedate;
    }

    /**
     * 获取过了此日期就将会员状态置为暂停
     *
     * @return expireDate - 过了此日期就将会员状态置为暂停
     */
    public Date getExpiredate() {
        return expiredate;
    }

    /**
     * 设置过了此日期就将会员状态置为暂停
     *
     * @param expiredate 过了此日期就将会员状态置为暂停
     */
    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    /**
     * @return joinDate
     */
    public Date getJoindate() {
        return joindate;
    }

    /**
     * @param joindate
     */
    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    /**
     * @return referrerId
     */
    public Integer getReferrerid() {
        return referrerid;
    }

    /**
     * @param referrerid
     */
    public void setReferrerid(Integer referrerid) {
        this.referrerid = referrerid;
    }

    /**
     * @return profileId
     */
    public Integer getProfileid() {
        return profileid;
    }

    /**
     * @param profileid
     */
    public void setProfileid(Integer profileid) {
        this.profileid = profileid;
    }

    /**
     * 获取通用代码，类型：channel
     *
     * @return channel - 通用代码，类型：channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置通用代码，类型：channel
     *
     * @param channel 通用代码，类型：channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * @return specials
     */
    public String getSpecials() {
        return specials;
    }

    /**
     * @param specials
     */
    public void setSpecials(String specials) {
        this.specials = specials;
    }

    /**
     * @return consumptionTotal
     */
    public BigDecimal getConsumptiontotal() {
        return consumptiontotal;
    }

    /**
     * @param consumptiontotal
     */
    public void setConsumptiontotal(BigDecimal consumptiontotal) {
        this.consumptiontotal = consumptiontotal;
    }

    /**
     * @return consumptionTimes
     */
    public Integer getConsumptiontimes() {
        return consumptiontimes;
    }

    /**
     * @param consumptiontimes
     */
    public void setConsumptiontimes(Integer consumptiontimes) {
        this.consumptiontimes = consumptiontimes;
    }

    /**
     * @return consumptionGap
     */
    public Integer getConsumptiongap() {
        return consumptiongap;
    }

    /**
     * @param consumptiongap
     */
    public void setConsumptiongap(Integer consumptiongap) {
        this.consumptiongap = consumptiongap;
    }

    /**
     * @return yearlyTimes
     */
    public Integer getYearlytimes() {
        return yearlytimes;
    }

    /**
     * @param yearlytimes
     */
    public void setYearlytimes(Integer yearlytimes) {
        this.yearlytimes = yearlytimes;
    }

    /**
     * @return lastConsumptionDate
     */
    public Date getLastconsumptiondate() {
        return lastconsumptiondate;
    }

    /**
     * @param lastconsumptiondate
     */
    public void setLastconsumptiondate(Date lastconsumptiondate) {
        this.lastconsumptiondate = lastconsumptiondate;
    }

    /**
     * @return referenceTimes
     */
    public Integer getReferencetimes() {
        return referencetimes;
    }

    /**
     * @param referencetimes
     */
    public void setReferencetimes(Integer referencetimes) {
        this.referencetimes = referencetimes;
    }

    /**
     * 获取通用代码（不可见），类型：memberstate，S-待审，I-未生效，A-有效，P-暂停，X-注销
     *
     * @return state - 通用代码（不可见），类型：memberstate，S-待审，I-未生效，A-有效，P-暂停，X-注销
     */
    public String getState() {
        return state;
    }

    /**
     * 设置通用代码（不可见），类型：memberstate，S-待审，I-未生效，A-有效，P-暂停，X-注销
     *
     * @param state 通用代码（不可见），类型：memberstate，S-待审，I-未生效，A-有效，P-暂停，X-注销
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return unsign
     */
    public Boolean getUnsign() {
        return unsign;
    }

    /**
     * @param unsign
     */
    public void setUnsign(Boolean unsign) {
        this.unsign = unsign;
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