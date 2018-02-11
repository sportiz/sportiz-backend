package co.sportiz.backend.controller;

import static co.sportiz.backend.model.SportizResponse.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.sportiz.backend.model.ContextMenu;
import co.sportiz.backend.model.ContextMenuItem;
import co.sportiz.backend.model.SportizResponse;
import co.sportiz.backend.service.ContextMenuService;

@Controller
@RequestMapping("/context/")
public class ContextMenuController {
	
	@Autowired
	private ContextMenuService contextMenuService;
	
	@CrossOrigin
	@RequestMapping(path="/", method=RequestMethod.GET)
	public @ResponseBody ContextMenu readContextMenu() {
		return contextMenuService.fetchContextMenu();
	}

	@RequestMapping( path="/", method=RequestMethod.POST)
	public @ResponseBody SportizResponse storeNewContextMenuItem(@RequestParam ContextMenuItem item) {
		try {
			contextMenuService.storeContextMenuItem(item);
			return new SportizResponse(ResponseStatus.SUCCESS, "Context Menu added successfully.");
		}catch (Exception e) {
			return new SportizResponse(ResponseStatus.FAILED, e.getMessage());
		}
	}
}
