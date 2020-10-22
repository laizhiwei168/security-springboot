package com.lzw.bootframe.exception;

import com.lzw.bootframe.common.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: UnionExceptionHandler
 * Description:
 *
 * @author honghh
 * @date 2019/04/01 10:03
 */
@Slf4j
@RestControllerAdvice
public class UnionExceptionHandler {

    /**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     *
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        log.info("binder.getFieldDefaultPrefix {}",binder.getFieldDefaultPrefix());
        log.info("binder.getFieldMarkerPrefix {}",binder.getFieldMarkerPrefix());
    }
    /**
     * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
     * @param model
     */
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("author", "harry");
    }
    /**
     * Description : 全局异常捕捉处理
     * Group :
     *
     * @author honghh
     * @date  2019/4/1 0001 10:34
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(ParamException.class)
    public Object apiExceptionHandler(ParamException ex) {
        log.error("ApiException 异常抛出：{}", ex);
        return JsonData.fail(ex.getMessage());
    }

}

