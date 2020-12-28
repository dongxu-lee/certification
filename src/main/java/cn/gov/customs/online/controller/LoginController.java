package cn.gov.customs.online.controller;

import cn.gov.customs.online.utils.RespUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author lidongxu
 * @date 2020/12/28
 * @Description
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public RespUtil login(@RequestBody String ent, HttpServletRequest request) {
        JSONObject json = JSONObject.parseObject(ent);
        String entStr = json.getString("ent");
        HttpSession session = request.getSession(true);
        session.setAttribute("ent", entStr);
        return RespUtil.success("200", "登录成功", null);
    }

}
