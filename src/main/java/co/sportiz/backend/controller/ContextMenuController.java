package co.sportiz.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.sportiz.backend.model.ContextMenu;
import co.sportiz.backend.service.ContextMenuService;

@Controller
@RequestMapping("/context/")
public class ContextMenuController {
	
	@Autowired
	private ContextMenuService contextMenuService;
	
	@CrossOrigin
	@RequestMapping("/")
	public @ResponseBody ContextMenu readContextMenu() {
		return contextMenuService.fetchContextMenu();
	}

}
