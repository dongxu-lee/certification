package cn.gov.customs.online.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 首页导航tab切换
 */
@Controller
public class IndexController {

    /**
     * 默认初始显示公告页面
     * @return
     */
    @RequestMapping(value = "/notice", method = RequestMethod.GET)
    public String notice() {
        return "notice";
    }

    /**
     * 切换到企业备案申请页面
     * @return
     */
    @RequestMapping(value = "/entrecord", method = RequestMethod.GET)
    public String entrecord() {
        return "entrecord";
    }

    /**
     * 切换到企业未备案页面
     * @return
     */
    @RequestMapping(value = "/norecord", method = RequestMethod.GET)
    public String norecord() {
        return "norecord";
    }

    /**
     * 切换到企业备案通过页面
     * @return
     */
    @RequestMapping(value = "/recorded", method = RequestMethod.GET)
    public String recorded() {
        return "recorded";
    }

    /**
     * 切换到企业备案变更申请页面
     * @return
     */
    @RequestMapping(value = "/entrecordchange", method = RequestMethod.GET)
    public String entrecordchange() {
        return "entrecordchange";
    }

    /**
     * 切换到代理企业信息维护页面
     * @return
     */
    @RequestMapping(value = "/agencyent", method = RequestMethod.GET)
    public String agencyent() {
        return "agencyent";
    }
    /**
     * 切换到申报员信息页面
     * @return
     */
    @RequestMapping(value = "/reporter", method = RequestMethod.GET)
    public String reporter() {
        return "reporter";
    }

    /**
     * 切换到产品预审页面
     * @return
     */
    @RequestMapping(value = "/prereview", method = RequestMethod.GET)
    public String prereview() {
        return "prereview";
    }

    /**
     * 切换到调查互动页面
     * @return
     */
    @RequestMapping(value = "/surveyreaction", method = RequestMethod.GET)
    public String surveyreaction() {
        return "surveyreaction";
    }

    /**
     * 切换到实地调查预约通知单查询页面
     * @return
     */
    @RequestMapping(value = "/surveyappointnotice", method = RequestMethod.GET)
    public String surveyappointnotice() {
        return "surveyappointnotice";
    }

    /**
     * 切换到受理情况查询页面
     * @return
     */
    @RequestMapping(value = "/accept", method = RequestMethod.GET)
    public String accept() {
        return "accept";
    }

    /**
     * 切换到政策信息查询页面
     * @return
     */
    @RequestMapping(value = "/policy", method = RequestMethod.GET)
    public String policy() {
        return "policy";
    }




}
