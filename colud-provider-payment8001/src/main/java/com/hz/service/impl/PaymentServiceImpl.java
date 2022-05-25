package com.hz.service.impl;

import com.hz.Mapper.PaymentDao;
import com.hz.pojo.Payment;
import com.hz.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public void create(Payment payment) {
        paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);

    }
}
