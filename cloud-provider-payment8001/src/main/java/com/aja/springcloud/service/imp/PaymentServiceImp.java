package com.aja.springcloud.service.imp;

import com.aja.springcloud.dao.PaymentDao;
import com.aja.springcloud.entities.Payment;
import com.aja.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImp implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }


    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
