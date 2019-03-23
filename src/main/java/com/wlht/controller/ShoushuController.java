package com.wlht.controller;


import com.github.pagehelper.PageInfo;
import com.ldg.api.vo.PageParam;
import com.wlht.api.SessionUtil;
import com.wlht.api.po.Stdopslevel;
import com.wlht.api.po.Stdopsoperationmark;
import com.wlht.api.service.ShoushuService;
import com.wlht.api.vo.HospitalOfficeVo;
import com.wlht.api.vo.SearForShoushu;
import com.wlht.api.vo.SimpleStdopsoperationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/shoushu")
public class ShoushuController {
    @Autowired
    private ShoushuService shoushuService;

    @RequestMapping(value = "/getAllShoushu")
    public String getAllHospitalOffice(HttpServletRequest request, PageParam pageParam, SearForShoushu param) throws Exception {
        param.setYyIdentity(SessionUtil.getYyIdentityForCZY(request));
        PageInfo<SimpleStdopsoperationVo> page = shoushuService.getAllHospitalShoushu(pageParam, param);
        request.setAttribute("page",page);
        return "/cmdp/shoushu/disList.jsp";
    }
    /**
     * 修改手术
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/editHoapitalShoushu")
    public String editHoapitalShoushu(HttpServletRequest request, Long id) throws Exception {
        SimpleStdopsoperationVo hospitalOffice=shoushuService.selectShoushuByID(id);
        request.setAttribute("obj",hospitalOffice);
        List<Stdopslevel> ssLevellist=shoushuService.selectShoushuLeves();
        List<Stdopsoperationmark> ssmarklist=shoushuService.selectShoushuMarks();
        request.setAttribute("ssLevellist",ssLevellist);
        request.setAttribute("ssmarklist",ssmarklist);
        return "/cmdp/shoushu/add.jsp";
    }

    @RequestMapping(value = "/saveShoushu")
    public String saveKSXXInfo(HttpServletRequest request,SimpleStdopsoperationVo param) throws Exception {
        int insertNum=shoushuService.saveShoushu(param);
        return "/shoushu/getAllShoushu";
    }
}
