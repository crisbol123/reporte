package com.pragma.reportes.adapters.driven.feigns.clients;


import com.pragma.reportes.adapters.driven.feigns.FeignClientConfig;
import com.pragma.reportes.adapters.driven.feigns.dto.AuthorizationRequest;
import com.pragma.reportes.adapters.driven.feigns.dto.AuthorizationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user", url = "${usuario.service.url}", configuration = FeignClientConfig.class)
public interface UserFeignClient {
    @GetMapping("/auth-user/validate")
    AuthorizationResponse validateToken(@RequestBody AuthorizationRequest authorizationRequest);



}