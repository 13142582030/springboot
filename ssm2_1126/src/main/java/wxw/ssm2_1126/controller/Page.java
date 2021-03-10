package wxw.ssm2_1126.controller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wxw.ssm2_1126.pojo.New;

@Controller
@RequestMapping("/page")
public class Page {


    @RequestMapping("/a")
    @ResponseBody
    public String aa(){
        New n = new New();
        n.setPwd("qwewq");
        n.setName("eqweqwe");
        String json = new Gson().toJson(n);
        return json;
    }


}
