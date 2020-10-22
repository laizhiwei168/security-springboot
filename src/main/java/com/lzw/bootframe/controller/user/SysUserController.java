package com.lzw.bootframe.controller.user;

import com.lzw.bootframe.common.JsonData;
import com.lzw.bootframe.exception.ParamException;
import com.lzw.bootframe.param.UserParam;
import com.lzw.bootframe.util.BeanValidator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


/**
 * swagger 访问地址 http://127.0.0.1:8080/swagger-ui.html
 */

@RestController
@RequestMapping("/user")
@Api(value = "RestFul测试接口",tags = "RestFulController",description = "测试接口")
public class SysUserController {


    @GetMapping(value = "/getUser" , produces = "application/json; charset=utf-8")// 解决返回值乱码问题
    @ApiOperation(value = "查询用户", notes = "查询用户")
    @ResponseBody
    public JsonData getUse(UserParam param){
        System.out.println("param:"+param);
        param.setUsername("11");
        if(param.getDeptId()!=null){
            throw new ParamException("111111111111");
        }
        //BeanValidator.check(param);
        return  JsonData.success(param);
    }

    @PostMapping(value ="/getUser" , produces = "application/json; charset=utf-8")// 解决返回值乱码问题
    @ApiOperation(value = "新增用户", notes = "查询用户")
    @ResponseBody
    public JsonData getUser(UserParam param){
        System.out.println("param:"+param);
        param.setUsername("11");
        BeanValidator.check(param);
        return  JsonData.success();
    }

    //
    @GetMapping("/getUser1")
    @ApiOperation(value = "查询用户1", notes = "查询用户1")
    @ApiImplicitParam(name = "id" , value = "用户id" ,required = true,dataType = "Integer", paramType = "path")
    public String getUser1(Integer id ){
        System.out.println("id:"+id);
        return "ok";
    }

    @PreAuthorize("hasAuthority('p1')")
    @RequestMapping("/r/r1")
    public String r1(){
        return "okr1";
    }


    @PreAuthorize("hasAuthority('p2')")
    @RequestMapping("/r/r2")
    public String r2(){
        return "okr2";
    }


    @RequestMapping(value = "/login-success" , produces = {"text/plain;charset=UTF-8"})
    public String loginSuccess(){
        return "登录成功";
    }

}
