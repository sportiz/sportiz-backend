package co.sportiz.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Iterables;

import co.sportiz.backend.model.ContextMenu;
import co.sportiz.backend.model.ContextMenuItem;
import co.sportiz.backend.repository.ContextMenuRepo;

@Service
public class ContextMenuService {

	@Autowired
	private ContextMenuRepo contextMenuRepo;
	
	@Transactional
	public ContextMenu fetchContextMenu() {
		ContextMenu menus = new ContextMenu();
		menus.setMenuItems(Iterables.toArray(contextMenuRepo.findAll(), ContextMenuItem.class));
		return menus;
	}

	@Transactional
	public void storeContextMenuItem(String name, String icon, String value) {
		contextMenuRepo.save(new ContextMenuItem(name, icon, value));
		
	}
}
