package co.sportiz.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/context/")
public class ContextMenuController {
	
	@RequestMapping("/")
	public @ResponseBody String readContextMenu() {
		return "{"
				+"	\"menu_items\" : ["
				+"		{"
				+"			\"name\" : \"Football\","
				+"			\"icon\" : \"fa fa-chevron-circle-right\","
				+"			\"value\" : \"football\" "
				+"		},"
				+"		{"
				+"			\"name\" : \"Baseball\","
				+"			\"icon\" : \"fa fa-futbol-o\","
				+"			\"value\" : \"baseball\" "
				+"		},"
				+"		{"
				+"			\"name\" : \"Basket Ball\","
				+"			\"icon\" : \"fa fa-certificate\","
				+"			\"value\" : \"basketball\" "
				+"		},"
				+"		{"
				+"			\"name\" : \"Soccer\","
				+"			\"icon\" : \"fa fa-soccer-ball-o\","
				+"			\"value\" : \"soccer\""
				+"		}"
				+"	]"
				+"}";
	}

}
