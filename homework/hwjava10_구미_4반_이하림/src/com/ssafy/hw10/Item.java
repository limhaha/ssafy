package com.ssafy.hw10;

public class Item {
	private String title;
	private String link;
	private String description;
	private String author;
	private String guid;
	private String comments;
	private String pubDate;
	
	
	public Item() {}
	
	public Item(String title, String link, String description, String author, String guid, String comments,
			String pubDate) {
		this.title = title;
		this.link = link;
		this.description = description;
		this.author = author;
		this.guid = guid;
		this.comments = comments;
		this.pubDate = pubDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	@Override
	public String toString() {
		return "Item [title=" + title + ", link=" + link + ", description=" + description + ", author=" + author
				+ ", guid=" + guid + ", comments=" + comments + ", pubDate=" + pubDate + "]";
	} 
	
	
	
}
