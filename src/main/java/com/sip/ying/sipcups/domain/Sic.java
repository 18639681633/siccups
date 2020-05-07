package com.sip.ying.sipcups.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor //需要无惨构造器
@XmlRootElement(name = "SIC")
public class Sic{
    private String CHDRCOY;            //--公司码
    private String CHDRNUM;              //--保单号
    private String PLCYNUM;              //--投保单号
    private String PRINTFLAG;            //--再打标志 值域：0是正常打印，1是补打或情况重新下发补打
    private String SENDTIMES;            //--补打次数 值域：首次打印为1，补打是从一个表中获取最大次数加1
    private String QUDAOCLASS;             //--渠道类型
    private String SRCEBUSCODE;              //--渠道编号
    private String SRCEBUS;              //--渠道编号对应的中文信息
    private String CHDRQD;             //--保单类型 值域：0纸质 1电子
    private String CHDRTYPE;               //--产品名称
    private String CNTTYPE;              //--产品编码
    private String CNTBRANCH;            //--支公司编码
    private String COYNAME;              //--支公司中文名
    private String COYADDR;              //--支公司地址
    private String ARACDE;             //--管理处
    private String ARACDENAME;             //--管理处名称
    private String ARACDE1;              //--县域机构代码
    private String ARACDENAME1;              //--代理人归属管理处机构名称
    private String AGNTCOY;              //--营销员公司号
    private String AGNTNUM;              //--营销员编号
    private String AGNTNAME;               //--营销员名称
    private String MEDICODE;               //--网点代码
    private String MEDIUMNAME;             //--网点名称
    private String REPORTAG;               //--银行代理编号
    private String BKAGNAME;               //--银行代理名称
    private String SURNAME;              //--投保人名称
    private String CLTSEX;             //--投保人性别  M--男士 F--女士
    private String COWNNUM;              //--投保人客户号
    private String CLIENTIMPORTANCETYPE;               //--投保人高客标记-贵宾等级  值域：0-未知  Y-是 N-否
    private String CLTPHONE;               //--特出处理环节：对电话进行保密处理（暂无处理）
    private String STATCODE;               //--投保人证件类别
    private String LITERAL;              //--投保人证件类别名称
    private String SECUITYNO;            //--投保人证件号
    private String CLTADDR;              //--投保人地址
    private String CLTPCODE;               //--投保人邮编
    private String CLTDOB;             //--投保人生日
    private String RINTERNET;            //--投保人电子邮件
    private String BANKKEY;              //--银行代码
    private String BANKDESC;               //--银行名称
    private String BANKACCKEY;             //--银行账户
    private String HPRRCVDT;               //--首次签发日期
    private String PICTYPE;               //--如果是1需要咱们生成投保单 并且贴投保人签名影像，如果是2咱们生成投保单并且贴投保人+被保人的签名影像，其他情况不需要咱们生成投保单，直接贴投保单影像，
    private String PICFLAG;              //--影像标记 值域：Y-有  N- 没有
    private String OCCDATE;               //--保单生效日期
    private String RCESDTE;              //--保单风险终止日期
    private String NOFDAY;             //--犹豫期
    private String ACCTAMT;              //--首期保费
    private String ALLFXPREMIUM;               //--附加险的保险费用和
    private String PREMIUM;              //--每期保险费
    private String BILLFREQ;               //--缴费频率
    private String PTDATE;             //--已缴费至日期
    private String JF_TYPE;              //--第一主险的交费方式
    private String JF_DATE;              //--第一主险的交费日期
    private String HUOMIANNOTE;              //--豁免信息
    private String ALLXJDESC;            //--现价和
    private String YCBFLAG;                 //--预承保标记   值域：1=预承保；0=非预承保
    private String ISMDFLAG;                //--是否需要生产投保单模板 Y 是   N 不是
}
