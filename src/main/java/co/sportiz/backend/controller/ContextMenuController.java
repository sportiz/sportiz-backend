package co.sportiz.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.sportiz.backend.model.ContextMenu;
import co.sportiz.backend.model.ContextMenuItem;

@Controller
@RequestMapping("/context/")
public class ContextMenuController {
	
	@CrossOrigin
	@RequestMapping("/")
	public @ResponseBody ContextMenu readContextMenu() {
		ContextMenu menus = new ContextMenu();
		menus.setMenuItems(new ContextMenuItem[] {
				new ContextMenuItem("Football", "fa fa-chevron-circle-right", "football"),
				new ContextMenuItem("Baseball", "fa fa-futbol-o", "baseball"),
				new ContextMenuItem("Basket Ball", "fa fa-certificate", "basketball"),
				new ContextMenuItem("Soccer", "fa fa-soccer-ball-o", "soccer")
		});
		return menus;
//		return "{\n"
//				+"	\"menu_items\" : [\n"
//				+"		{\n"
//				+"			\"name\" : \"Football\",\n"
//				+"			\"icon\" : \"fa fa-chevron-circle-right\",\n"
//				+"			\"value\" : \"football\" \n"
//				+"		},\n"
//				+"		{\n"
//				+"			\"name\" : \"Baseball\",\n"
//				+"			\"icon\" : \"fa fa-futbol-o\",\n"
//				+"			\"value\" : \"baseball\" \n"
//				+"		},\n"
//				+"		{\n"
//				+"			\"name\" : \"Basket Ball\",\n"
//				+"			\"icon\" : \"fa fa-certificate\",\n"
//				+"			\"value\" : \"basketball\" \n"
//				+"		},\n"
//				+"		{\n"
//				+"			\"name\" : \"Soccer\",\n"
//				+"			\"icon\" : \"fa fa-soccer-ball-o\",\n"
//				+"			\"value\" : \"soccer\"\n"
//				+"		}\n"
//				+"	]\n"
//				+"}\n";
	}

}
