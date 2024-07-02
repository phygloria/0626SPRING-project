package com.ohgiraffers.spring_project.dy.dy_controller;

import com.ohgiraffers.spring_project.dy.dy_model.dy_entity.DayoungEntity;
import com.ohgiraffers.spring_project.dy.dy_service.DayoungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/daYoungPage")
public class DayoungController {

    private final DayoungService dayoungService;

    @Autowired
    public DayoungController(DayoungService dayoungService) {
        this.dayoungService = dayoungService;
    }

    @GetMapping("/daYoungPage?pageNumber={pageNumber}")
    public ModelAndView daYoungPage(@PathVariable int pageNumber) {
        ModelAndView modelAndView = new ModelAndView("page/Dayoung/MainDayoung");

        List<DayoungEntity> entityList = dayoungService.findEntitiesByPageNumber(pageNumber);

        modelAndView.addObject("connectPage", "main");
        modelAndView.addObject("List", entityList);

        return modelAndView;
    }
}
