package com.zerobase.convpay.dto;

import com.zerobase.convpay.type.PayResult;

public class PayResponse {

    //결제 결과
    PayResult payResult;

    //결제 성공 금액
    Integer PaidAmount;

    @Override
    public String toString() {
        return "PayResponse{" +
                "payResult=" + payResult +
                ", PaidAmount=" + PaidAmount +
                '}';
    }

    public PayResponse(PayResult payResult, Integer paidAmount) {
        this.payResult = payResult;
        PaidAmount = paidAmount;
    }

    public PayResult getPayResult() {
        return payResult;
    }

    public void setPayResult(PayResult payResult) {
        this.payResult = payResult;
    }

    public Integer getPaidAmount() {
        return PaidAmount;
    }

    public void setPaidAmount(Integer paidAmount) {
        PaidAmount = paidAmount;
    }
}
