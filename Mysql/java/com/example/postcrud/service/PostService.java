package com.example.postcrud.service;

import java.sql.SQLException;

public interface PostService {

	public List<Posts>getAllPost() throws SQLException;
	public String inserPost(Posts posts) throws SQlException;
	public String deletePost(int pid) throwsSQLException;
	
}

	public List<Posts> getAllPosts() throws SqlException {
		return dao.getAllposts();
		
	}
	
	public String inserPost(Posts posts) throws SQLException {
		return dao.inserPost(posts);
		
	}
	
	public String deletePost(int pid) throws SQLException {
		return dao.deletePost(pid);
	}
	
	public String updatePost(String author) throws SQLException {
		return dao.updatePost(author);
	}
	
	
	
	}
	public String insertPost(int pid) throws SQLException {
		String sql ="insert into posts values (?????)";
		pst = con.prepareStatment(sql);
		pst.setInt(1,pid);
		pst.executeUpdate();
		return "RecordInserted...";
	
	
	public String deletePost(int pid) throws SQLException {
		String sql ="insert into posts values (?????)";
		pst = con.prepareStatment(sql);
		pst.setInt(1,pid);
		pst.executeUpdate();
		return "Record deleted...";
		
		

	public String updatePost(String author)throws SqlException {
		String sql ="update posts set author='abhi' where author='bharat'";
		pst = con.prepareStatment(sql);
		pst.setString(3,author);
		pst.executeUpdate();
		return "Record updated....";
	
	}
		