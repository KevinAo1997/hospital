package com.aokai.hospital.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.aokai.hospital.utils.TokenUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/5 18:05
 */
@Component
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler)throws Exception{
        if(request.getMethod().equals("OPTIONS")){
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        }
        response.setCharacterEncoding("utf-8");
        String token = request.getHeader("Authorization");
        if(token != null){
            boolean result = TokenUtil.verify(token);
            if(result){
                System.out.println("通过拦截器");
                return true;
            }
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        try{
            JSONObject json = new JSONObject();
            json.put("msg","token verify fail");
            json.put("code","50000");
            response.getWriter().append(json.toJSONString());
            System.out.println("认证失败，未通过拦截器");
        }catch (Exception e){
            e.printStackTrace();
            response.sendError(500);
            return false;
        }
        return false;
    }
}
