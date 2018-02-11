package co.sportiz.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContextMenu {

	@JsonProperty("menu_items")
	private ContextMenuItem[] menuItems;

	public ContextMenuItem[] getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(ContextMenuItem[] menuItems) {
		this.menuItems = menuItems;
	}
	
}