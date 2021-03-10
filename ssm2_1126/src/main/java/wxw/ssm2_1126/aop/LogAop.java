package wxw.ssm2_1126.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;


@Component
@Aspect
/****
 * 该注解应该和  <aop:aspectj-autoproxy/> 连用，但是
 * spring.aop.auto=true 已经开启了自动代理支持    @EnableAspectjAutoProxy
 * 所以不需要在配置
 */
public class LogAop {

    Logger  logger = LoggerFactory.getLogger(LogAop.class);

    @Pointcut(value = "execution(* wxw.ssm2_1126.service..*.*(..))")
    public void pointcut1(){}

    @Pointcut(value = "execution(* wxw.ssm2_1126..*.*(..))")
    public void pointcut2(){}

    @Before("pointcut1()")
    public void before(){
        //RequestContextHolder是 springmvc提供的获取 请求
        RequestAttributes requestAttributes=RequestContextHolder.getRequestAttributes();
        //requestAttributes.getAttribute();
        logger.info("===============before===============");
        System.out.println(logger.getClass());
    }

}
