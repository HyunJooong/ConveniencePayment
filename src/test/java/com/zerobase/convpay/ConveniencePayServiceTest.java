package com.zerobase.convpay;

import com.zerobase.convpay.dto.PayCancelRequest;
import com.zerobase.convpay.dto.PayCancelResponse;
import com.zerobase.convpay.service.ConveniencePayService;
import com.zerobase.convpay.type.ConvenienceType;
import com.zerobase.convpay.dto.PayRequest;
import com.zerobase.convpay.dto.PayResponse;
import com.zerobase.convpay.type.PayCancelResult;
import com.zerobase.convpay.type.PayResult;
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

    @Test
    void pay_fail() {
        //given
        PayRequest request = new PayRequest(ConvenienceType.GS25, 1000000);
        //when
        PayResponse payResponse = conveniencePayService.pay(request);
        //then
        assertEquals(PayResult.FAIL, payResponse.getPayResult());
        assertEquals(0, payResponse.getPaidAmount());
    }

    @Test
    void pay_cancel_success() {
        //given
        PayCancelRequest request = new PayCancelRequest(ConvenienceType.GS25, 10000);
        //when
        PayCancelResponse payResponse = conveniencePayService.payCancel(request);
        //then
        assertEquals(PayCancelResult.PAY_CANCEL_SUCCESS, payResponse.getPayCancelResult());
        assertEquals(10000, payResponse.getPayCanceldAmount());

    }

    @Test
    void pay_cancel_fail() {
        //given
        PayCancelRequest request = new PayCancelRequest(ConvenienceType.CU, 50);
        //when
        PayCancelResponse payResponse = conveniencePayService.payCancel(request);
        //then
        assertEquals(PayCancelResult.PAY_CANCEL_FAILED, payResponse.getPayCancelResult());
        assertEquals(0, payResponse.getPayCanceldAmount());
    }


}