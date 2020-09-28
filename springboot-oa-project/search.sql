SELECT DISTINCT
	f.* 
FROM
	sys_user u,
	sys_user_role_r ur,
	sys_role r,
	sys_role_func_r fr,
	sys_function f 
WHERE
	u.ID = ur.user_Id 
	AND ur.role_Id = r.id 
	AND r.id = fr.role_Id 
	AND fr.func_Id = f.id 
	AND u.user_name = 'lsf' 
	AND r.site_id = '1' 
	AND f.func_type !=4
