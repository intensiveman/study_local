package com.yixian.study.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version V1.0
 * @description:
 * @author: wangdi
 * @date: 2023-01-23 8:12
 */
@Controller
public class Page {

    @RequestMapping("/page")
    public String page2() {
        System.out.println("pass");
        return "index";
    }
}
