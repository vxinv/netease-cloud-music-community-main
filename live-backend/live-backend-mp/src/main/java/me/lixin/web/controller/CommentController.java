package me.lixin.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.lixin.web.dto.CommentDTO;
import me.lixin.web.request.GetCommentDetailRequest;
import me.lixin.web.request.PublishCommentRequest;
import me.lixin.web.request.DeleteCommentRequest;
import me.lixin.web.request.QueryMomentCommentRequest;
import me.lixin.web.response.BaseResponse;
import me.lixin.web.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(description = "评论")
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @ApiOperation(value = "评论")
    @PostMapping(value = "/publishComment")
    public BaseResponse<Long> publishComment(@Valid @RequestBody PublishCommentRequest request) {

        return commentService.publishComment(request);
    }

    @ApiOperation(value = "删除评论")
    @PostMapping(value = "/deleteComment")
    public BaseResponse deleteComment(@Valid @RequestBody DeleteCommentRequest request) {

        return commentService.deleteComment(request);
    }

    @ApiOperation(value = "查询动态评论")
    @PostMapping(value = "/queryMomentComment")
    public BaseResponse<List<CommentDTO>> queryMomentComment(@Valid @RequestBody QueryMomentCommentRequest request) {

        return commentService.queryMomentComment(request);
    }

    @ApiOperation(value = "获取评论详情")
    @PostMapping(value = "/getCommentDetail")
    public BaseResponse<CommentDTO> getCommentDetail(@Valid @RequestBody GetCommentDetailRequest request) {

        return commentService.getCommentDetail(request);
    }

}
