package com.korit.projectrrs.service;

import com.korit.projectrrs.dto.ResponseDto;
import com.korit.projectrrs.dto.reservation.request.ReservationPostRequestDto;
import com.korit.projectrrs.dto.reservation.request.ReservationPutRequestDto;
import com.korit.projectrrs.dto.reservation.response.ReservationGetResponseDto;
import com.korit.projectrrs.dto.reservation.response.ReservationPostResponseDto;
import com.korit.projectrrs.dto.reservation.response.ReservationPutResponseDto;
import com.korit.projectrrs.security.PrincipalUser;

import java.util.List;

public interface ReservationService {
    ResponseDto<ReservationPostResponseDto> createReservation(PrincipalUser principalUser, ReservationPostRequestDto dto);
    ResponseDto<List<ReservationGetResponseDto>> getAllReservationByUserId(PrincipalUser principalUser);
    ResponseDto<ReservationGetResponseDto> getReservationByReservationId(PrincipalUser principalUser);
    ResponseDto<ReservationPutResponseDto> putReservationByReservationId(ReservationPutRequestDto dto);
    ResponseDto<Void> deleteReview(Long reservationId);
}
