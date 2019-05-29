/*
package com.martin.customsign.javajiaqian;

import com.ggj.finance.customs.clearance.annotation.HttpLog;
import com.ggj.finance.customs.clearance.dto.PlatDataOpenDTO;
import com.ggj.finance.customs.clearance.service.CustomsClearanceService;
import com.ggj.finance.customs.clearance.utils.RequestUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

*/
/**
 *
 *//*

@RestController
@HttpLog
public class CustomsClearanceController {
    @Resource
    private CustomsClearanceService customsClearanceService;

    @ApiOperation(value = "企业实时数据获取")
    @RequestMapping(value = "/custom/platDataOpen", method = RequestMethod.POST)
    public PlatDataOpenDTO platDataOpen(HttpServletRequest request) throws IOException {
        Map<String, String> paramMap = RequestUtils.formToParamMap(request);
        return customsClearanceService.platDataOpen(paramMap);
    }
}
*/
