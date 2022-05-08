package com.axuan.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.axuan.springcloud.entities.CommonResult;
import org.springframework.stereotype.Component;

/**
 * @author axuan
 * @date 2022/4/23 下午8:36
 */
@Component
public class CustomerBlockHandler {

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler");
    }

}
