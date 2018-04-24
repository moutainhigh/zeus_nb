package com.taobao.zeus.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
@RestController
@RequestMapping("/")
public class StatisticReportController  extends BaseController{
    private static final Logger logger = LoggerFactory.getLogger(StatisticReportController.class);

    @RequestMapping(value = "/statistic_report", method = RequestMethod.GET)
    public ModelAndView homePage(HttpServletResponse response) throws Exception {
        return new ModelAndView("statisticreport");
    }
}
