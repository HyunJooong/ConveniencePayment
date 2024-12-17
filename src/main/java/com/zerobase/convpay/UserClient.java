package com.zerobase.convpay;

import com.zerobase.convpay.dto.PayCancelRequest;
import com.zerobase.convpay.dto.PayCancelResponse;
import com.zerobase.convpay.dto.PayRequest;
import com.zerobase.convpay.dto.PayResponse;
import com.zerobase.convpay.service.ConveniencePayService;
import com.zerobase.convpay.type.ConvenienceType;

public class UserClient {
    public static void main(String[] args) {
        // 사용자 역할

        ConveniencePayService conveniencePayService = new ConveniencePayService();

        //결제 1000원
        PayRequest payRequest = new PayRequest(ConvenienceType.GS25, 10000000);
        PayResponse response = conveniencePayService.pay(payRequest);
        System.out.println(response);

        //취소 500원
        PayCancelRequest payCancelRequest = new PayCancelRequest(ConvenienceType.GS25, 500);
        conveniencePayService.payCancel(payCancelRequest);
        PayCancelResponse payCancelResponse = conveniencePayService.payCancel(payCancelRequest);
        System.out.println(payCancelResponse);
    }

}
