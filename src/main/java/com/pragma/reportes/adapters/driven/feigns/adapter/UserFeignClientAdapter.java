package com.pragma.reportes.adapters.driven.feigns.adapter;


import com.pragma.reportes.adapters.driven.feigns.clients.UserFeignClient;
import com.pragma.reportes.adapters.driven.feigns.dto.AuthorizationRequest;
import com.pragma.reportes.adapters.driven.feigns.dto.AuthorizationResponse;
import com.pragma.reportes.domain.spi.UserFeignClientPort;

public class UserFeignClientAdapter implements UserFeignClientPort {
    private final UserFeignClient userFeignClient;

    public UserFeignClientAdapter(UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
    }

    @Override
    public AuthorizationResponse validateToken(String token) {

        return userFeignClient.validateToken(new AuthorizationRequest(token));

    }


}
