package co.sportiz.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/context/")
public class ContextMenuController {
	
	@RequestMapping("/")
	public @ResponseBody String readContextMenu() {
		return "{\n"
				+"	\"menu_items\" : [\n"
				+"		{\\n"
				+"			\"name\" : \"Football\",\n"
				+"			\"icon\" : \"fa fa-chevron-circle-right\",\n"
				+"			\"value\" : \"football\" \n"
				+"		},\n"
				+"		{\n"
				+"			\"name\" : \"Baseball\",\n"
				+"			\"icon\" : \"fa fa-futbol-o\",\n"
				+"			\"value\" : \"baseball\" \n"
				+"		},\n"
				+"		{\n"
				+"			\"name\" : \"Basket Ball\",\n"
				+"			\"icon\" : \"fa fa-certificate\",\n"
				+"			\"value\" : \"basketball\" \n"
				+"		},\n"
				+"		{\n"
				+"			\"name\" : \"Soccer\",\n"
				+"			\"icon\" : \"fa fa-soccer-ball-o\",\n"
				+"			\"value\" : \"soccer\"\n"
				+"		}\n"
				+"	]\n"
				+"}\n";
	}

}
