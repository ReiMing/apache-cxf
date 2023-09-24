package cn.qiulim.restservice.demo.Controller;


import cn.qiulim.restservice.demo.Bean.HelloWorldBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RestController
public class HelloWorldController {


    @Autowired
    private MessageSource messageSource;

    //Get
    //URI -/hello
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloworld() {
        return "hello world";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloworldbean() {

        return new HelloWorldBean("hello-world-bean","hello-world-bean2");
    }

    @GetMapping(path = "/hello-world-bean/path-varlible/{name}")
    public HelloWorldBean helloworldPathVariable(@PathVariable String name) {

        return new HelloWorldBean(String.format("hello-world;%s", name),String.format("hello-world;%s", name));
    }

    @GetMapping(path = "/hello-world-internationalized")
    public String helloWorldInternationalized(
            @RequestHeader(name = "Accept-Language", required = false) Locale locale) {

        return messageSource.getMessage("good.morning.message", null, locale);
    }

    @PostMapping(path="/hello-world-post")
    public ResponseEntity<Map<String,String>> postHelloworld(@RequestBody HelloWorldBean helloWorldBean) {

        Map map = new HashMap();
        map.put("msg",helloWorldBean.getMessage());
        map.put("msg2",helloWorldBean.getMessage2());

        return  ResponseEntity.ok(map);
    }
}
