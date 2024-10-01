package com.pragma.reportes.domain.spi;


import com.pragma.reportes.adapters.driven.feigns.dto.AuthorizationResponse;

public interface UserFeignClientPort {
    AuthorizationResponse validateToken(String token);

}
