package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;


@Controller
public class Dictionary {
    @GetMapping("/convert")
    public String getForm(){
        return "form";
    }
    @PostMapping("/convert")
    public String convert(@RequestParam String vn, Model model){
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("hello","xin chào");
        stringMap.put("bye","tạm biệt");
        stringMap.put("one","một");
        stringMap.put("two","hai");
        String result = stringMap.get(vn);

        if (result == null){
            model.addAttribute("search",vn);
            return "error";
        }else {
            model.addAttribute("search",vn);
            model.addAttribute("result",result);
            return "form";
        }
    }
}
