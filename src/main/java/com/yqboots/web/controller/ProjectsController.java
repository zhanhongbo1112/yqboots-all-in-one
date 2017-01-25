package com.yqboots.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for projects.
 *
 * @author Eric H B Zhan
 * @since 1.2.0
 */
@Controller
public class ProjectsController {
    @PreAuthorize("hasPermission('/projects/framework', 'com.yqboots.menu.core.MenuItem', 'READ')")
    @RequestMapping(value = "/projects/framework")
    public String framework() {
        return "projects/framework/index";
    }

    @PreAuthorize("hasPermission('/projects/initializer', 'com.yqboots.menu.core.MenuItem', 'READ')")
    @RequestMapping(value = "/projects/initializer")
    public String initializer() {
        return "projects/initializer/index";
    }

    @PreAuthorize("hasPermission('/projects/actuator', 'com.yqboots.menu.core.MenuItem', 'READ')")
    @RequestMapping(value = "/projects/actuator")
    public String actuator() {
        return "projects/actuator/index";
    }
}
