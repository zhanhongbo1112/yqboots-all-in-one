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

    @RequestMapping(value = "/features/thumbnail/v01")
    public String thumbnailV01() {
        return "features/thumbnail/v01/index";
    }

    @RequestMapping(value = "/features/thumbnail/v02")
    public String thumbnailV02() {
        return "features/thumbnail/v02/index";
    }

    @RequestMapping(value = "/features/thumbnail/v03")
    public String thumbnailV03() {
        return "features/thumbnail/v03/index";
    }

    @RequestMapping(value = "/features/thumbnail/v04")
    public String thumbnailV04() {
        return "features/thumbnail/v04/index";
    }

    @RequestMapping(value = "/features/testimonial/v01")
    public String testimonialV01() {
        return "features/testimonial/v01/index";
    }

    @RequestMapping(value = "/features/testimonial/v02")
    public String testimonialV02() {
        return "features/testimonial/v02/index";
    }

    @RequestMapping(value = "/features/testimonial/v03")
    public String testimonialV03() {
        return "features/testimonial/v03/index";
    }

    @RequestMapping(value = "/features/testimonial/v04")
    public String testimonialV04() {
        return "features/testimonial/v04/index";
    }

    @RequestMapping(value = "/features/testimonial/v05")
    public String testimonialV05() {
        return "features/testimonial/v05/index";
    }

    @RequestMapping(value = "/features/testimonial/v06")
    public String testimonialV06() {
        return "features/testimonial/v06/index";
    }
}
