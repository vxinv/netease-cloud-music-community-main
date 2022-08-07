package me.lixin.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.lixin.web.request.ShareRequest;
import me.lixin.web.response.BaseResponse;
import me.lixin.web.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(description = "分享")
@RestController
@RequestMapping("/share")
public class ShareController {

    @Autowired
    private ShareService shareService;

    @ApiOperation(value = "分享")
    @PostMapping(value = "/share")
    public BaseResponse share(@Valid @RequestBody ShareRequest request) {

        shareService.share(request);
        return new BaseResponse();
    }

}
