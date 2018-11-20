package com.ifengxue.novel.spider.interfaces;

/**
 * 观察者
 * @author LiuKeFeng
 * @date   2016年9月17日
 */
public interface Observable {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
	public void notifyObservers(Object arg);
}
