/*package com.syaccp.easybuy.controller;

import java.beans.PropertyEditorSupport;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.syaccp.easybuy.entity.News;
import com.syaccp.easybuy.service.NewsService;

@Controller
@RequestMapping("/mvc")
public class mvcController {
    @Resource
    private NewsService newsService;
    private mvcController() {
        System.out.println("mvcController 做出来了");
    }
    @RequestMapping("/hello")
    public String hello(){   
        System.out.println("mvc做出来了");
        return "hello";

    }
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
            // String类型转换，将所有传递进来的String进行HTML编码，防止XSS攻击

            // Date 类型转换
            binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
                    @Override
                    public void setAsText(String text) {
                            setValue(DateUtils.parseDate(text));
                    }

            });
    }
    @RequestMapping(value="/delete/{id}/{ccc}",method=RequestMethod.GET)
    public String delete(@PathVariable(value="id") Integer ids,@PathVariable(value="ccc") Integer ggg) {

            System.out.println("NewsController delete===>"+ids);
            System.out.println("NewsController delete===>"+ggg);
            List<News> findAll = newsService.findAll();
            for (News news : findAll) {
                System.out.println(">>>>>>>>>>>>>>"+news.getTitle());
            }
           
            return "hello";

    }
@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
    public String delete(@PathVariable(value="id") Integer ids) {

            System.out.println("NewsController delete===>"+ids);

            return "hello";

    }
}*/