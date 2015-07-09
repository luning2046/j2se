package cys.gh.simplifyDao6;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cys.gh.ORM5.User;

public class UserDao extends Dao{

	public int updateUser(User user){
		String sql = "update user set name=?,password=? where id=?";
		int rows = super.update(sql,new Object[]{user.getName(),user.getPassword(),user.getId()});
		return rows;
	}
	
	public List<User> findUser(User user){
		List<User> users = null;
		String sql = "select * from user where name=?";
		Object[] objs = new Object[]{user.getName()};
		List<Object> os = super.find(sql, objs);
		
		for(Object obj : os){//将集合中每一个元素都是Object转换为User类型
			User u = (User)obj;
			users.add(u);
		}
		return users;
	}
	@Override
	public Object mappingObj(ResultSet rs) {
		User user = new User();
		try {
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setPassword(rs.getString(3));
		} catch (SQLException e){
			e.printStackTrace();
		}
		return user;
	}
}
