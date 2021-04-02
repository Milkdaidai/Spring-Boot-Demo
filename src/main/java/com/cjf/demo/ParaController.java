package com.cjf.demo;


import org.springframework.web.bind.annotation.*;

/**
 * 描述 演示各种传参
 */
@RestController
@RequestMapping("/user")
public class ParaController {

    /**
     * 测试接口
     * @return
     */
    @GetMapping({"/firstrequest"})
    public String firstRequest() {
        return "第一个测试接口";
    }

    /**
     * 传入参数
     * @param num
     * @return
     */
    @GetMapping({"/requestPara"})
    public String requestPara(@RequestParam Integer num) {
        return "传入的参数值是：" + num;
    }

    /**
     * 通过Url的方式传入参数
     * @param num
     * @return
     */
    @GetMapping({"/request/{num}"})
    public String requestUrl(@PathVariable Integer num){
        return "传入的参数是："+num;
    }


    /**
     * 多个url指向同一个接口
     * @param num
     * @return
     */
    @GetMapping({"/multiUrl/{num}","/multiUrl1/{num}"})
    public String multiUrl(@PathVariable Integer num){
        return "传入的参数是："+num;
    }


}
