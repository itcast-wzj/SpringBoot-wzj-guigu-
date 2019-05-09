package com.example.demo.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "person")
public class Person {
	//1.对应:字面量
	private String name;
	private Integer age;
	private Boolean boss;
	
	//2.对应:对象和Map
	private GirlFriend girlFriend;
	private Map<String, Object> map;
	
	//3.对应:数组(List|Set)
	private List<String> list;
	private Set<String> set;
	
	//注意: 一定要生成getter和setter方法,否则配置文件的值是不会映射到属性上的 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getBoss() {
		return boss;
	}
	public void setBoss(Boolean boss) {
		this.boss = boss;
	}
	public GirlFriend getGirlFriend() {
		return girlFriend;
	}
	public void setGirlFriend(GirlFriend girlFriend) {
		this.girlFriend = girlFriend;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	
	//为了方便测试,生成一个toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", boss=" + boss + ", girlFriend=" + girlFriend + ", map="
				+ map + ", list=" + list + ", set=" + set + "]";
	}
	
}
