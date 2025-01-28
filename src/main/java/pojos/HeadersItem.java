package pojos;

import java.util.List;

public class HeadersItem{
	private String name;
	private List<HeaderElementsItem> headerElements;
	private String value;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setHeaderElements(List<HeaderElementsItem> headerElements){
		this.headerElements = headerElements;
	}

	public List<HeaderElementsItem> getHeaderElements(){
		return headerElements;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}
}