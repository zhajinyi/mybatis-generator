package com.zjy.generator.utils;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理器
 *
 * @author zhajinyi
 * @date 2019年06月17日 上午10:27:52
 */
@Component
public class ExceptionHandler implements HandlerExceptionResolver {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
										 HttpServletResponse response, Object handler, java.lang.Exception ex) {
		Result result = new Result();
		try {
			response.setContentType("application/json;charset=utf-8");
			response.setCharacterEncoding("utf-8");

			if (ex instanceof Exception) {
				result.put("code", ((Exception) ex).getCode());
				result.put("msg", ((Exception) ex).getMessage());
			}else if(ex instanceof DuplicateKeyException){
				result = Result.error("数据库中已存在该记录");
			}else{
				result = Result.error();
			}

			//记录异常日志
			logger.error(ex.getMessage(), ex);

			String json = JSON.toJSONString(result);
			response.getWriter().print(json);
		} catch (java.lang.Exception e) {
			logger.error("RRExceptionHandler 异常处理失败", e);
		}
		return new ModelAndView();
	}
}
