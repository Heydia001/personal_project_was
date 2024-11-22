package com.korit.projectrrs.dto.customerSupportController.response;

import com.korit.projectrrs.entity.CustomerSupport;
import lombok.Data;

import java.time.LocalTime;

@Data
public class CustomerSupportGetResponseDto {
    private Long customerSupportId;
    private String customerSupportTitle;
    private String customerSupportContent;
    private String customerSupportStatus;
    private LocalTime customerSupportCreateAt;
    private char customerSupportCategory;

    private CustomerSupportGetResponseDto(CustomerSupport customerSupport){
        this.customerSupportId = customerSupport.getCustomerSupportId();
        this.customerSupportTitle = customerSupport.getCustomerSupportTitle();
        this.customerSupportContent = customerSupport.getCustomerSupportContent();
        this.customerSupportStatus = customerSupport.getCustomerSupportStatus();
        this.customerSupportCategory = getCustomerSupportCategory();
    }
}
