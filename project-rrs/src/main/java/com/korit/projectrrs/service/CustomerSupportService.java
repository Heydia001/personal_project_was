package com.korit.projectrrs.service;

import com.korit.projectrrs.dto.ResponseDto;
import com.korit.projectrrs.dto.customerSupportController.request.CustomerSupportPostRequestDto;
import com.korit.projectrrs.dto.customerSupportController.request.CustomerSupportUpdateRequestDto;
import com.korit.projectrrs.dto.customerSupportController.response.CustomerSupportGetResponseDto;
import com.korit.projectrrs.dto.customerSupportController.response.CustomerSupportUpdateResponseDto;

import java.util.List;

public interface CustomerSupportService {
    ResponseDto<CustomerSupportCreateResponseDto> createCustomerSupport(CustomerSupportPostRequestDto dto);

    ResponseDto<CustomerSupportGetResponseDto> getCustomerSupportByUserId(String userId, Long customerSupportId);

    ResponseDto<List<CustomerSupportGetResponseDto>> getAllCustomerSupportByUserId(String userId, Long customerSupportId);

    ResponseDto<CustomerSupportUpdateResponseDto> updateCustomerSupport(String userId, Long customerSupportId, CustomerSupportUpdateRequestDto dto);

    ResponseDto<Void> deleteCustomerService(Long customerSupportId);
}
