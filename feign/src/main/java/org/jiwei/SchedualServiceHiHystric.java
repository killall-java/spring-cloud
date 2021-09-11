package org.jiwei;

import org.jiwei.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements FeignService {
    @Override
    public String hi(String name) {
        return "FeignService" + name + "失败";
    }
}
