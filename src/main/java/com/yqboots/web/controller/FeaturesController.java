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

    @RequestMapping(value = "/features/thumbnails/v01")
    public String thumbnailsV01() {
        return "features/thumbnails/v01/index";
    }

    @RequestMapping(value = "/features/thumbnails/v02")
    public String thumbnailsV02() {
        return "features/thumbnails/v02/index";
    }

    @RequestMapping(value = "/features/thumbnails/v03")
    public String thumbnailsV03() {
        return "features/thumbnails/v03/index";
    }

    @RequestMapping(value = "/features/thumbnails/v04")
    public String thumbnailsV04() {
        return "features/thumbnails/v04/index";
    }
}
