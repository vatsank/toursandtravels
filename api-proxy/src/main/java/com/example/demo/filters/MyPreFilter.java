package com.example.demo.filters;

import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
public class MyPreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		
       RequestContext ctx =RequestContext.getCurrentContext();	
       
     
      Enumeration<String> list =ctx.getRequest().getHeaderNames();
      
          while(list.hasMoreElements()) {
        	  log.info(list.nextElement());
          }
		
//          if(ctx.getRequest().getRequestURI().contains("tourist")) {
//        	  ctx.setResponseStatusCode(400);
//        	  ctx.setResponseBody("Zuul is preventing");
//        	  ctx.setSendZuulResponse(false);
//          }
//          
           return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
