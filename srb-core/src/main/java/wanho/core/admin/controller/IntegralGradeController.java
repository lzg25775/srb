package wanho.core.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wanho.commons.exception.BusinessException;
import wanho.commons.result.AjaxResult;
import wanho.core.admin.entity.IntegralGrade;
import wanho.core.admin.service.IIntegralGradeService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin/core/integralGrade")
@Api(tags = "积分登记管理")   //定义在类上
@CrossOrigin
@Slf4j
public class IntegralGradeController {
    @Autowired
    IIntegralGradeService iIntegralGradeService;

    @GetMapping("/list")
    @ApiOperation("获取积分等级列表")
    public AjaxResult getList(){
        log.info("==============================");
        log.warn("=========================warn");
        log.warn("abc=============");

        List<IntegralGrade> list = iIntegralGradeService.list();
//        if (true) {
//            throw  new BusinessException(-50012,"测试异常");
//        }
        return AjaxResult.ok("获取数据成功",list);
    }

    @DeleteMapping("/remove/{id}")
    @ApiOperation("根据id移除数据")
    public AjaxResult removeById(@ApiParam(value = "积分等级ID",required = true) @PathVariable long id) {
        boolean flag = iIntegralGradeService.removeById(id);
        if (flag){
            return AjaxResult.ok("删除成功");
        }
        return AjaxResult.ok("删除失败");
    }

    @GetMapping("/get/{id}")
    @ApiOperation("根据id查询数据")
    public AjaxResult findById(@ApiParam(value = "积分等级ID",required = true) @PathVariable long id) {
        IntegralGrade iGrade = iIntegralGradeService.getById(id);

        return AjaxResult.ok("获取数据成功",iGrade);
    }
    @PutMapping("update")
    @ApiOperation("修改数据")
    public AjaxResult update(@RequestBody IntegralGrade integralGrade ){
        System.out.println("==================update=====");
        boolean flag = iIntegralGradeService.updateById(integralGrade);
        if(flag){
            return AjaxResult.ok("修改成功!");
        }
        return AjaxResult.fail(-3,"修改失败!");
    }


}
