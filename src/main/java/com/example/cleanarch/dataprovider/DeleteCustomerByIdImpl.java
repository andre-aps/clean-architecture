package com.example.cleanarch.dataprovider;

import com.example.cleanarch.core.dataprovider.DeleteCustomerById;
import com.example.cleanarch.dataprovider.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeleteCustomerByIdImpl implements DeleteCustomerById {

    private final CustomerRepository customerRepository;

    @Override
    public void delete(final String id) {
        customerRepository.deleteById(id);
    }

}
