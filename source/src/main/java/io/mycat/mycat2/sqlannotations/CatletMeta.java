package io.mycat.mycat2.sqlannotations;


import io.mycat.mycat2.annotation.filter.CatletCmd;
import io.mycat.mycat2.annotation.filter.SQLAnnotationCmd;

public class CatletMeta implements SQLAnnotationMeta {
	
	/**
	 * 执行的hbt的类名称
	 * */
	private String clazz ;
	

	public String getClazz() {
		return clazz;
	}


	public void setClazz(String clazz) {
		this.clazz = clazz;
	}


	@Override
	public SQLAnnotationCmd getSQLAnnotationCmd() {
		return new CatletCmd();
	}
}
