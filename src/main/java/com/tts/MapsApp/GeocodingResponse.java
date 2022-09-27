package com.tts.MapsApp;

import java.util.List;

import lombok.Data;

@Data
public class GeocodingResponse {
    private List<Geocoding> results;

	public List<Geocoding> getResults() {
		return results;
	}

	public void setResults(List<Geocoding> results) {
		this.results = results;
	}
}