package com.rkgn.Controller;

import com.rkgn.pojo.Result;
import com.rkgn.pojo.ResultList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.type.ArrayType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

@RequestMapping("/result")
@Controller
public class ResultController {

    @RequestMapping(value = "/decode",method = RequestMethod.POST)
    @ResponseBody
    public ResultList decode(@RequestBody ResultList results) {
        return results;
    }
}
