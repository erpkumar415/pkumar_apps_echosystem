package com.jcombat.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jcombat.bean.Employee;
import com.jcombat.exception.EmployeeNotFoundException;

@RestController
public class EmployeeController {

	/*
	 * http://localhost:8080/RESTWithSpringMVCException/Ramesh?empId=1234
	 * https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/http/HttpStatus.html
	 */
	@RequestMapping(value = "/{firstName}", method = RequestMethod.GET)
	public ResponseEntity<Employee> showMessage(
			@PathVariable("firstName") String firstName,
			@RequestParam(value = "empId", required = false, defaultValue = "00000") final String empId) throws Exception {

		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setFirstName(firstName);

		if (StringUtils.isNumeric(firstName)) {
			throw new EmployeeNotFoundException(firstName);
		}
		else if (!StringUtils.isAlphanumeric(firstName)) {
			throw new Exception("Invalid  name type ");
		}else if (!StringUtils.isAlphanumericSpace(firstName)) {
			throw new SQLException("SQL Exception type ");
		}else if (StringUtils.isAllLowerCase(firstName)) {
			throw new IOException("IO Exception type ");
		}
		
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

}