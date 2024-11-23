package com.korit.projectrrs.dto.review.response;

import com.korit.projectrrs.entity.Review;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ReviewPostResponseDto {
    private LocalDate reviewCreateAt;
    private int reviewScore;
    private String reviewContent;

    public ReviewPostResponseDto (Review review) {
        this.reviewCreateAt = review.getReviewCreateAt();
        this.reviewScore = review.getReviewScore();
        this.reviewContent = review.getReviewContent();
    }
}
