package com.myuax.ejercicio51;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/calculadora", method = RequestMethod.POST)
	public String calculator(HttpServletRequest request, Locale locale, Model model) {
		logger.info("calculando.", locale);
		String value1String = request.getParameter("value1");
		String value2String = request.getParameter("value2");
		double result = 0;
		if (!value1String.isEmpty()) {
			result = Double.parseDouble(value1String);
		}

		if (!value2String.isEmpty()) {

			double value = Double.parseDouble(value2String);
			
			Map parameters = request.getParameterMap();
			if (parameters.containsKey("suma")) {
				result += value;
			} else if (parameters.containsKey("resta")) {
				result -= value;
			} else if (parameters.containsKey("division")) {
				result /= value;
			} else if (parameters.containsKey("multiplicacion")) {
				result *= value;
			}

		}
		String resultF = result+"";
		
		model.addAttribute("result", resultF );
		return "home";
	}
}
