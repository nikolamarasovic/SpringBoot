package com.SpringApp.app;

import static org.junit.Assert.assertEquals;

import com.SpringApp.app.domain.Client;

import org.junit.Before;
import org.junit.Test;

public class ClientTest {
 Client client;
 
 @Before
 public void setUp(){
     client = new Client();
 }
 @Test
 public void getId() throws Exception{
     client.setId(2);
     assertEquals(2, client.getId());
 }
}