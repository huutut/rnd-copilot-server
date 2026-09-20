package com.copilot.controller;

import com.copilot.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/dashboard")
public class DashboardController {

    @GetMapping("/stats")
    public Result<Map<String, Object>> getDashboardStats() {
        Map<String, Object> stats = new HashMap<>();
        stats.put("todayCommits", 1248);
        stats.put("aiAdoptRate", "42.5%");
        stats.put("activeDevelopers", 86);
        
        String[] days = {"周一", "周二", "周三", "周四", "周五", "周六", "周日"};
        int[] commitData = {820, 932, 901, 934, 1290, 330, 410};
        int[] adoptData = {35, 38, 40, 42, 45, 41, 43};
        
        stats.put("days", days);
        stats.put("commitData", commitData);
        stats.put("adoptData", adoptData);
        
        return Result.success(stats);
    }
}