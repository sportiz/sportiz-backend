package co.sportiz.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.sportiz.backend.model.ContextMenuItem;

@Repository
public interface ContextMenuRepo extends CrudRepository<ContextMenuItem, Long>
{
	public ContextMenuItem findTop();
}
