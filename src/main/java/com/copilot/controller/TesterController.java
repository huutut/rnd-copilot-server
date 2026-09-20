package com.copilot.controller;

import com.copilot.common.Result;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/copilot")
public class TesterController {

    @RequestMapping(value = "/stats", method = {RequestMethod.GET, RequestMethod.POST})
    public Result<Map<String, Object>> mockTestEndpoint(@RequestBody(required = false) Map<String, Object> body) {
        Map<String, Object> responseData = new HashMap<>();
        responseData.put("result", "接口联通性良好，效能网关鉴权通过");
        responseData.put("receivedPayload", body != null ? body : "No payload received");
        
        return Result.success(responseData);
    }
}