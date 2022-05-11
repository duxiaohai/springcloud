package com.atguigu.springcloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * Author: linjianhai
 * Date: 2022/5/10 20:05
 */
public class CommonBlockHandler {

    public static CommonResult handlerBlock1(BlockException exception){
        return new CommonResult(400,"全局处理限流异常提示");
    }
}
