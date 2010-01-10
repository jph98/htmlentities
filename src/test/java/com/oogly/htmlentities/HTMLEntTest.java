package com.oogly.htmlentities;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.oogly.htmlentities.HTMLEnt;

public class HTMLEntTest {

	@Test
	public void shouldReturnCorrectEntity() {
		assertThat("Should return correct entity name.", HTMLEnt.AMP.getName(), is(equalTo("&amp;")));
	}
	
	@Test
	public void shouldLookupEntityGivenCode() {		
		assertThat("Should lookup by code.", HTMLEnt.getEntity(38), is(equalTo(HTMLEnt.AMP)));
	}
	
	@Test
	public void shouldLookupEntityGivenChar() {		
		assertThat("Should lookup by char.", HTMLEnt.getEntity('&').getName(), is(equalTo(HTMLEnt.AMP.getName())));
	}
	
	@Test
	public void shouldReturnCorrectToString() {
		assertThat("Should return toString() correctly.", HTMLEnt.AMP.toString(), is(equalTo(HTMLEnt.AMP.getChar())));
	}	
}
