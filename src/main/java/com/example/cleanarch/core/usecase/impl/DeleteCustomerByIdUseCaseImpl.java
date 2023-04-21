package com.example.cleanarch.core.usecase.impl;

import com.example.cleanarch.core.dataprovider.DeleteCustomerById;
import com.example.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.example.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final DeleteCustomerById deleteCustomerById;

    public DeleteCustomerByIdUseCaseImpl(final FindCustomerByIdUseCase findCustomerByIdUseCase, final DeleteCustomerById deleteCustomerById) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomerById = deleteCustomerById;
    }

    @Override
    public void delete(final String id) {
        findCustomerByIdUseCase.find(id);
        deleteCustomerById.delete(id);
    }

}
