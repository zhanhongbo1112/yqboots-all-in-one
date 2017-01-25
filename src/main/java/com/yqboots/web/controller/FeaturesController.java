package com.yqboots.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for features.
 *
 * @author Eric H B Zhan
 * @since 1.2.0
 */
@Controller
public class FeaturesController {
    @RequestMapping(value = "/features/timeline/v01")
    public String timelineV01() {
        return "features/timeline/v01/index";
    }

    @RequestMapping(value = "/features/timeline/v02")
    public String timelineV02() {
        return "features/timeline/v02/index";
    }
}
