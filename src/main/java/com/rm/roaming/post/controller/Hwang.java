package com.rm.roaming.post.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("post/*")
public class Hwang {
	@RequestMapping("hwangTestMap")
	public String hwangTestMap() {
		return "post/hwangTestMap";
	}
}
