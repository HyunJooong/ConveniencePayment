package com.zerobase.convpay.dto;

import com.zerobase.convpay.type.ConvenienceType;

public class PayCancelRequest {

    //편의점 종류
    ConvenienceType conveniencType;
    //결제 금액
    Integer payCancelAmount;

    public PayCancelRequest(ConvenienceType conveniencType, Integer payCancelAmount) {
        this.conveniencType = conveniencType;
        this.payCancelAmount = payCancelAmount;
    }

    public ConvenienceType getConveniencType() {
        return conveniencType;
    }

    public void setConveniencType(ConvenienceType conveniencType) {
        this.conveniencType = conveniencType;
    }

    public Integer getPayCancelAmount() {
        return payCancelAmount;
    }

    public void setPayCancelAmount(Integer payCancelAmount) {
        this.payCancelAmount = payCancelAmount;
    }


}
