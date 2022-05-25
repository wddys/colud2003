package com.hz.service;

import com.hz.pojo.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public void create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}

