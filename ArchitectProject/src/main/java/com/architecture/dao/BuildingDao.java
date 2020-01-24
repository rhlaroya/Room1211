package com.architecture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.architecture.model.Building;
import com.architecture.util.ConnectionUtil;;

public class BuildingDao implements CrudRepository<Building> {

	@Override
	public int save(Building t) {
		Connection conn = null;
		try{
			conn = ConnectionUtil.connect();
			if(t.getOwner()!=0) {
				String sql = "insert into building (name, owner_id) values (?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, t.getName());
				ps.setInt(2, t.getOwner());
				return ps.executeUpdate();
			}
			
			
			else {
				String sql = "insert into building (name) values (?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, t.getName());
				return ps.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Building t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Building t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Building findById(int id) {
		try {
			Connection conn = ConnectionUtil.connect();
			PreparedStatement ps = conn.prepareStatement("select * from building where id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return new Building(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Building> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
