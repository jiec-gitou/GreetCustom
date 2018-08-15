package jp.co.jiec;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * バッキングビーン
 */
@Named
@ApplicationScoped
public class GreetingBean {
	/** あいさつ */
	public String getGreet() {
		return "よろしく!!!!";
	}
	
	/** リストを返すメソッド */
	public List<String> getItems(){
		List<String> items = new ArrayList<>();
		for(char c='a'; c<='e'; c++) {
			items.add("___" + c + "___");
		}
		return items;
	}

	/** 変数 */
	private String name="abcde";
	/** setterメソッド */
	public void setName(String name) {
		this.name = name;
	}
	/** getterメソッド */
	public String getName() {
		return this.name;
	}
}