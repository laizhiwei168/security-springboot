package com.lzw.bootframe.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Api 修饰整个类
 * @apiOperation 描述一个类的一个方法
 * @Apiparam 单个参数描述
 * @Apimodel 用对象来接收参数
 * @ApiModelProperty 用对象接收参数时，描述对象的一个字段
 * @ApiResponse http响应其中1个描述
 * @ApiResponses http响应整体描述
 * @ApiError 发生错误返回的信息
 * @ApilmplicitParam 一个请求参数
 * @apimplicitParams 多个请求参数
 */

@RestController
@RequestMapping("/swagger")
public class SwaggerController {

    @RequestMapping("/getUser")
    public String getUser(){
        return "ok";
    }
}
