package com.TripGuide;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/main", method = {RequestMethod.GET, RequestMethod.POST})
public class MainController {
    @PostMapping("/getTest")
    @GetMapping("/getTest")
    public String getTest() {
        return "Backend copied. Test succeeded!!!";
    }
}
