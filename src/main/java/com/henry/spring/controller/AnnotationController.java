package com.henry.spring.controller;

import com.henry.spring.bean.Cat;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by w-teng on 2016/12/17.
 */

@Controller
@RequestMapping("/")
public class AnnotationController {

    private static  Logger logger = Logger.getLogger(AnnotationController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/cat", method = RequestMethod.GET)
    @ResponseBody
    public Cat getCat(){
        Cat cat = new Cat();
        cat.setName("miao");
        cat.setColor("white");

        return cat;
    }

    @RequestMapping(value = "/cat", method = RequestMethod.POST)
    @ResponseBody
    public void saveCat(@RequestBody Cat cat) {
        logger.info(cat.getColor() + ";;;;" + cat.getName());

    }

}
