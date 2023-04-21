package com.example.cleanarch.core.usecase.impl;

import com.example.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.example.cleanarch.core.dataprovider.UpdateCustomer;
import com.example.cleanarch.core.domain.Customer;
import com.example.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.example.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final FindAddressByZipCode findAddressByZipCode;
    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(final FindCustomerByIdUseCase findCustomerByIdUseCase, final FindAddressByZipCode findAddressByZipCode,
        final UpdateCustomer updateCustomer) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(final Customer customer, final String zipCode) {
        findCustomerByIdUseCase.find(customer.getId());
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }

}