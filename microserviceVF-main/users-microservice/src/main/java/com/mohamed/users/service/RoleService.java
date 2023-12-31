package com.mohamed.users.service;

import java.util.List;

import com.mohamed.users.entities.Role;

public interface RoleService {
	Role saveRole(Role r);
	List<Role> getAllRoles();
	Role getRole(Long id);
	Role updateRole(Role r);
	void deleteRole(Role r);
	void deleteRoleById(Long id);
}
