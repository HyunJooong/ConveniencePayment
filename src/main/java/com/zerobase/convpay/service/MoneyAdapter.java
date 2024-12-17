package com.zerobase.convpay.service;

import com.zerobase.convpay.type.MoneyUseCancelResult;
import com.zerobase.convpay.type.MoneyUseResult;
import com.zerobase.convpay.type.PayCancelResult;

public class MoneyAdapter {

    public MoneyUseResult use(Integer payAmount) {
        System.out.println("MoneyAdapter.use: " + payAmount);
        if (payAmount > 100000) {
            return MoneyUseResult.USE_FAIL;
        }
        return MoneyUseResult.USE_SUCCESS;

    }

    public MoneyUseCancelResult moneyUseCancelResult(Integer payCancelAmount) {
        System.out.println("PayCancelAmount.useCancel: " + payCancelAmount);
        if (payCancelAmount < 100) {
            return MoneyUseCancelResult.MONEY_USE_CANCEL_FAIL_RESULT;
        }
        return MoneyUseCancelResult.MONEY_USE_CANCEL_SUCCESS_RESULT;


    }
}
