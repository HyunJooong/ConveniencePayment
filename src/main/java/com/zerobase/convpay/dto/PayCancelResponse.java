package com.zerobase.convpay.dto;

import com.zerobase.convpay.type.PayCancelResult;

public class PayCancelResponse {
    PayCancelResult payCancelResult;
    Integer payCanceldAmount;

    public PayCancelResponse(PayCancelResult payCancelResult, Integer payCanceldAmount) {
        this.payCancelResult = payCancelResult;
        this.payCanceldAmount = payCanceldAmount;
    }

    public PayCancelResult getPayCancelResult() {
        return payCancelResult;
    }

    public void setPayCancelResult(PayCancelResult payCancelResult) {
        this.payCancelResult = payCancelResult;
    }

    public Integer getPayCanceldAmount() {
        return payCanceldAmount;
    }

    public void setPayCanceldAmount(Integer payCanceldAmount) {
        this.payCanceldAmount = payCanceldAmount;
    }

    @Override
    public String toString() {
        return "PayCancelResponse{" +
                "payCancelResult=" + payCancelResult +
                ", payCanceldAmount=" + payCanceldAmount +
                '}';
    }
}
