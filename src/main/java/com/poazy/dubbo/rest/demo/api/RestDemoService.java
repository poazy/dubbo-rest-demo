package com.poazy.dubbo.rest.demo.api;

import com.poazy.dubbo.rest.demo.api.entity.DrdRQ;
import com.poazy.dubbo.rest.demo.api.entity.DrdRS;

public interface RestDemoService {

    DrdRS<Long> queryPrice(DrdRQ<Long> reqArgs);

}
