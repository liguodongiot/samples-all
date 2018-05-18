package com.lgd.es.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>Project: samples-all</p>
 * <p>Package: com.lgd.es.controller</p>
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author guodong.li
 * @version 1.0.0
 * @date 2018/5/18 11:25 星期五
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    // http://localhost:9999/demo/hello?name=li
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(String name) {
        return "hello: "+name;
    }
}
