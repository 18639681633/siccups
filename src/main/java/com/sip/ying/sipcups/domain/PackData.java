package com.sip.ying.sipcups.domain;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PackData {
    private String statusCode;
    private String message;
}
