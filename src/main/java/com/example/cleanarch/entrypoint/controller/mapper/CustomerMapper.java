package com.example.cleanarch.entrypoint.controller.mapper;

import com.example.cleanarch.core.domain.Customer;
import com.example.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.example.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, imports = {
    Customer.class,
    CustomerRequest.class,
    CustomerResponse.class
})
public interface CustomerMapper {

    Customer toCustomer(final CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(final Customer customer);

}