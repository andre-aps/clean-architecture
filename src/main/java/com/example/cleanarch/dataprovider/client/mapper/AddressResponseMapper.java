package com.example.cleanarch.dataprovider.client.mapper;

import com.example.cleanarch.core.domain.Address;
import com.example.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, imports = {
    Address.class,
    AddressResponse.class
})
public interface AddressResponseMapper {

    Address toAddress(final AddressResponse addressResponse);

}
