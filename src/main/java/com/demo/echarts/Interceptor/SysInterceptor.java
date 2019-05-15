package com.demo.echarts.Interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author ls
 * @Date 2019/05/15 14:54:46
 * @Description
 * @Version 1.0
 **/
@Component
public class SysInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String strBackUrl = "http://" + request.getServerName() + ":" + request.getServerPort()+ request.getRequestURI();
        System.out.println("---preHandle--- 拦截器url:"+strBackUrl);
        System.out.println("---拦截器开始执行---");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
