package com.kalhan.user_service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressResponseDto {
    private Long id;
    private Long userId;
    private String addressText;
}