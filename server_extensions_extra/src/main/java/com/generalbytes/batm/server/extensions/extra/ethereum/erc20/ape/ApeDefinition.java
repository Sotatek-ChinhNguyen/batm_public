package com.generalbytes.batm.server.extensions.extra.ethereum.erc20.ape;

import com.generalbytes.batm.common.currencies.CryptoCurrency;
import com.generalbytes.batm.server.extensions.CryptoCurrencyDefinition;
import com.generalbytes.batm.server.extensions.payment.IPaymentSupport;

public class ApeDefinition extends CryptoCurrencyDefinition{
    private IPaymentSupport paymentSupport = new ApePaymentSupport();

    public ApeDefinition() {
        super(CryptoCurrency.APE.getCode(), "ApeCoin ERC20 Token", "ethereum","https://apecoin.com/");
    }

    @Override
    public IPaymentSupport getPaymentSupport() {
        return paymentSupport;
    }
}
