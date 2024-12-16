package com.zerobase.convpay;

import com.zerobase.convpay.dto.ConvenienceType;
import com.zerobase.convpay.dto.PayRequest;
import com.zerobase.convpay.dto.PayResponse;
import com.zerobase.convpay.dto.PayResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConveniencePayServiceTest {
    ConveniencePayService conveniencePayService = new ConveniencePayService();

    @Test
    void pay_success() {
        //given
        PayRequest request = new PayRequest(ConvenienceType.GS25, 100);
        //when
        PayResponse payResponse = conveniencePayService.pay(request);
        //then
        assertEquals(PayResult.SUCCESS, payResponse.getPayResult());
        assertEquals(100, payResponse.getPaidAmount());

    }


}