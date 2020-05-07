package com.sip.ying.sipcups.controller;

import com.sip.ying.sipcups.domain.PackData;
import com.sip.ying.sipcups.domain.Sic;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

@RestController
@RequestMapping("/sip/ying")
public class SipPort {

    @PostMapping("/send/xml")
    public PackData receiveXml(String xml) throws Exception {
        System.out.println(xml);
        JAXBContext context = JAXBContext.newInstance(Sic.class);// Object为Xml所映射的类
        Unmarshaller unmar = context.createUnmarshaller();
        Sic s = (Sic) unmar.unmarshal(new StringReader(xml));
        System.out.println(s);
        return new PackData().setStatusCode("200").setMessage("请求成功！！");
    }

}
