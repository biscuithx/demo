package cn.berghuang.demo.Comtroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.BasicDBObjectBuilder;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "Hello World";
    }
}
