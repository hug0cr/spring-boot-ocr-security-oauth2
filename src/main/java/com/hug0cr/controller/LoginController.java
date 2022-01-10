/**
 * 
 */
package com.hug0cr.controller;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hug0cr
 * @date 2022-01-10
 */

@RestController
public class LoginController {
	
	@RequestMapping("/*")
	@RolesAllowed("USER")
	public String getUser() {
		return "Welcome, User";
	}
	
	@RequestMapping("/admin")
	@RolesAllowed("ADMIN")
	public String getAdmin() {
		return "Welcome, Admin";
	}

}
