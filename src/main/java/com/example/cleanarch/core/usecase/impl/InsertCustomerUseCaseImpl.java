package com.example.cleanarch.core.usecase.impl;

import com.example.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.example.cleanarch.core.dataprovider.InsertCustomer;
import com.example.cleanarch.core.dataprovider.SendCpfForValidation;
import com.example.cleanarch.core.domain.Customer;
import com.example.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;
    private final InsertCustomer insertCustomer;
    private final SendCpfForValidation sendCpfForValidation;

    public InsertCustomerUseCaseImpl(final FindAddressByZipCode findAddressByZipCode, final InsertCustomer insertCustomer,
        final SendCpfForValidation sendCpfForValidation) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
        this.sendCpfForValidation = sendCpfForValidation;
    }

    @Override
    public void insert(final Customer customer, final String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
        sendCpfForValidation.send(customer.getCpf());
    }

}
