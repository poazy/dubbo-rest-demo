package com.poazy.dubbo.rest.demo.impl;

import com.poazy.dubbo.rest.demo.api.RestDemoService;
import com.poazy.dubbo.rest.demo.api.entity.DrdRQ;
import com.poazy.dubbo.rest.demo.api.entity.DrdRS;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@DubboService
public class RestDemoServiceImpl implements RestDemoService {

    @Override
    public DrdRS<Long> queryPrice(@RequestBody  DrdRQ<Long> reqArgs) {
        DrdRS<Long> rs = new DrdRS<>();
        rs.setData(reqArgs.getData());
        rs.setCode(200);
        rs.setMsg("OK");
        return rs;
    }

}
