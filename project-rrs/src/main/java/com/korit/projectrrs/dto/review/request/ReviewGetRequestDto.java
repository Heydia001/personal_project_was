package com.korit.projectrrs.dto.review.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewGetRequestDto {
    private Long reviewId;
    private Long providerId;
}
