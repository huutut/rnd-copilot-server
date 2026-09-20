package com.copilot.controller;

import com.copilot.common.Result;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/generator")
public class GeneratorController {

    @PostMapping("/component")
    public Result<String> generateComponent(@RequestBody Map<String, String> request) {
        String prompt = request.get("prompt");
        if (prompt == null || prompt.trim().isEmpty()) {
            return Result.error(400, "需求描述不能为空");
        }

        String mockVueCode = "<template>\n" +
                "  <div class=\"user-table-container\">\n" +
                "    <el-table :data=\"tableData\" style=\"width: 100%\">\n" +
                "      <el-table-column prop=\"name\" label=\"姓名\" />\n" +
                "      <el-table-column prop=\"email\" label=\"邮箱\" />\n" +
                "    </el-table>\n" +
                "  </div>\n" +
                "</template>\n\n" +
                "<script setup>\n" +
                "import { ref } from 'vue'\n" +
                "const tableData = ref([{ name: '智能生成用户', email: 'ai@example.com' }])\n" +
                "</script>";

        return Result.success(mockVueCode);
    }
}