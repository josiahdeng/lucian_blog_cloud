package com.lucian.api.backend.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author denglingxiang
 * @date 2022/08/24 15:44
 **/
@FeignClient(name = "backend-post")
public interface FeignApi {

    @RequestMapping(method = RequestMethod.GET, value = "posts", consumes = "application/json")
    public String index();
}
