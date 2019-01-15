package nl.test.examplle;

import com.fasterxml.jackson.databind.ObjectMapper;

import nl.test.example.raml.model.AtlasImpl;
import nl.test.example.raml.model.Biome;

public class RamlExample {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			AtlasImpl a = mapper.readValue(
					"{\"regions\":[{\"id\":1,\"name\": \"Green\", \"kind\":\"Jungle\", \"animals\": [{\"legs\": 4}]}]}",
					AtlasImpl.class);
			System.out.println(a.getRegions());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			Biome b = mapper.readValue(
					"{\"id\":1,\"name\": \"Green\", \"kind\":\"Jungle\", \"animals\": [{\"legs\": 4}]}",
					Biome.class);
			System.out.println(b);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			Biome c = mapper.readValue(
					"{\"id\":1,\"name\": \"Pacific\", \"kind\":\"Ocean\", \"animals\": [{\"color\": \"yellow\"}]}",
					Biome.class);
			System.out.println(c);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
