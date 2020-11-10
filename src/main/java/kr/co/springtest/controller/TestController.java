package kr.co.springtest.controller;

import kr.co.springtest.beans.DataBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @GetMapping("/input_data")
    public String input_data(){
        return "input_data";
    }

    @PostMapping("/input_pro")
    public String input_pro(DataBean dataBean){

        sqlSessionTemplate.insert("test_db.insert_data", dataBean);

        return "input_pro";
    }

}
