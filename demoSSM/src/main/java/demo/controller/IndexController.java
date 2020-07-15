package demo.controller;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/test")
    public String Test(){
        return "test" ;
    }
}
