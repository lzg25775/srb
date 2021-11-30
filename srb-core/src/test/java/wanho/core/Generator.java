package wanho.core;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Generator {
    @Test
    void createTemplate() {
        //创建代码生成器
        AutoGenerator mpg = new AutoGenerator();
        //全局配置
        globalConfig(mpg);
        //数据源配置
        datasourceConfig(mpg);
        //配置包
        packageConfig(mpg);
        //代码生成策略
        strategyConfig(mpg);
        //执行生成器
        mpg.execute();

    }

    //全局配置
    void globalConfig(AutoGenerator mpg){
        // Step2：全局配置
        GlobalConfig gc = new GlobalConfig();
// 填写代码生成的目录(需要修改)
        String projectPath = "D:\\java162project\\srb\\srb-core";
        // 拼接出代码最终输出的目录
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("mamp");
// 配置是否打开目录，false 为不打开（可选）
        gc.setOpen(false);
// 实体属性 Swagger2 注解，添加 Swagger 依赖，开启 Swagger2 模式（可选）
        gc.setSwagger2(true);
        // 重新生成文件时是否覆盖，false 表示不覆盖（可选）
        //当生成的代码已经被修改后，不要选择覆盖  ※※※※※※※※※※※※※※※※※※
        gc.setFileOverride(true);
// 配置主键生成策略，此处为 ASSIGN_ID（可选）
        gc.setIdType(IdType.AUTO);
// 配置日期类型，此处为 ONLY_DATE（可选）
        gc.setDateType(DateType.ONLY_DATE);
// 默认生成的 service 会有 I 前缀
//        gc.setServiceName("%sService");
        mpg.setGlobalConfig(gc);
    }

    //配置数据库
    void datasourceConfig(AutoGenerator mpg){
        DataSourceConfig dsConfig = new DataSourceConfig();
        String url="jdbc:mysql://localhost:3306/srb_core?serverTimezone=Asia/Shanghai&useSSL=false";
        dsConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dsConfig.setUrl(url);
        dsConfig.setUsername("root");
        dsConfig.setPassword("123");

        mpg.setDataSource(dsConfig);

    }

    //配置包
    void packageConfig(AutoGenerator mpg){
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("wanho.core");
        packageConfig.setModuleName("admin");
        packageConfig.setEntity("entity");
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setController("controller");
        mpg.setPackageInfo(packageConfig);
    }

    //代码生成策略
    void strategyConfig(AutoGenerator mpg) {
        StrategyConfig config = new StrategyConfig();
        //指定表名，如果是全部表，则不需要设置
        //指定多张表的时候，则用多参数形式传递
//        config.setInclude("score","teacher");
        //用来定义实体类和数据表的映射规则
        config.setNaming(NamingStrategy.underline_to_camel);
        //设置数据库属性和实体类的属性之间的对应关系
        config.setColumnNaming(NamingStrategy.underline_to_camel);
        //设置Lombok模式
        config.setEntityLombokModel(true);
        //设置控制器驼峰命名
        config.setControllerMappingHyphenStyle(true);
        //设置控制器的restful风格
        config.setRestControllerStyle(true);

        //逻辑删除
        config.setLogicDeleteFieldName("is_deleted");
        //布尔型的值，去掉is前缀
        config.setEntityBooleanColumnRemoveIsPrefix(true);

        mpg.setStrategy(config);
    }
}
