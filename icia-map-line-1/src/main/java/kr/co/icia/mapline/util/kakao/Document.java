package kr.co.icia.mapline.util.kakao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Document {
	private Double x;
	private Double y;
	@JsonProperty("place_name")
	private String placeName;
	private String phone;

	public Double getX() {
		return x;
	}

	public Double getY() {
		return y;
	}
	
	public String getPlaceName() {
		return placeName;
	}
	public String getPhone() {
		return phone;
	}
}