package com.lucian.api.backend.service.impl;

import com.lucian.api.backend.feign.FeignApi;
import com.lucian.api.backend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author denglingxiang
 * @date 2022/08/27 11:46
 **/
@Service
public class PostServiceImpl implements PostService {

    FeignApi feignApi;

    @Autowired
    public void setPostApi(FeignApi feignApi) {
        this.feignApi = feignApi;
    }

    @Override
    public String index() {
        return feignApi.index();
    }
}
