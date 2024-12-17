package com.zerobase.convpay.dto;

import com.zerobase.convpay.service.MoneyAdapter;
import com.zerobase.convpay.type.MoneyUseCancelResult;
import com.zerobase.convpay.type.MoneyUseResult;
import org.junit.jupiter.api.Test;

import static com.zerobase.convpay.type.MoneyUseResult.USE_FAIL;
import static org.junit.jupiter.api.Assertions.*;

class MoneyUseResultTest {
    MoneyAdapter moneyAdapter = new MoneyAdapter();

    @Test
    void money_use_fail() {
        //given
        Integer payAmount = 100001;
        //when
        MoneyUseResult moneyUseResult = moneyAdapter.use(payAmount);
        //then
        assertEquals(USE_FAIL, moneyUseResult);
    }

    @Test
    void money_use_success() {
        //given
        Integer payAmount = 100;

        //when
        MoneyUseResult moneyUseResult = moneyAdapter.use(payAmount);
        //then
        assertEquals(moneyUseResult.USE_SUCCESS, moneyUseResult);
    }

    @Test
    void money_use_cancel_fail() {
        //given
        Integer payCancelAmount = 1;
        //when
        MoneyUseCancelResult moneyUseCancelResult = moneyAdapter.moneyUseCancelResult(payCancelAmount);
        //then
        assertEquals(MoneyUseCancelResult.MONEY_USE_CANCEL_FAIL_RESULT, moneyUseCancelResult);
    }

    @Test
    void moeny_use_cancel_success() {
        ///given
        Integer payCancelAmount = 101;
        //when
        MoneyUseCancelResult moneyUseCancelResult = moneyAdapter.moneyUseCancelResult(payCancelAmount);
        //then
        assertEquals(MoneyUseCancelResult.MONEY_USE_CANCEL_SUCCESS_RESULT, moneyUseCancelResult);
    }

}