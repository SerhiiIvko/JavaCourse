package com.servlet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.*;
import javax.servlet.http.*;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.mockito.Mockito;

public class FileUploadDBServletTest extends Mockito {
//    FileUploadDBServlet fileUploadDBServlet;
//    HttpServletRequest mockhttpServletRequest;
//    HttpServletResponse mockhttpServletResponse;
//
//    @Before
//    public void setUp(){
//        fileUploadDBServlet=new FileUploadDBServlet();
//        mockhttpServletRequest=createNiceMock(HttpServletRequest.class);
//        mockhttpServletResponse=createNiceMock(HttpServletResponse.class);
//    }
//
//    @Test
//    public void testService()throws Exception{
//        File file= new File("Sample.txt");
//        File.createTempFile("ashok","txt");
//        expect(mockhttpServletRequest.getParameter("username")).andReturn("ashok");
//        expect(mockhttpServletResponse.getWriter()).andReturn(new PrintWriter(file));
//        replay(mockhttpServletRequest);
//        replay(mockhttpServletResponse);
//        fileUploadDBServlet.doGet(mockhttpServletRequest, mockhttpServletResponse);
//        FileReader fileReader=new FileReader(file);
//        int count = 0;
//        String str = "";
//        while ( (count=fileReader.read())!=-1){
//            str=str+(char)count;
//        }
//
//        Assert.assertTrue(str.trim().equals("Helloashok"));
//        verify(mockhttpServletRequest);
//        verify(mockhttpServletResponse);
//
//    }

    @Test
    public void doPost() throws Exception {
//        HttpServletRequest request = mock(HttpServletRequest.class);
//        HttpServletResponse response = mock(HttpServletResponse.class);
//        BufferedReader bufferedReader = org.mockito.Mockito.mock(BufferedReader.class);
//
//        when(request.getParameter("firstName")).thenReturn("me");
//        when(request.getParameter("lastName")).thenReturn("secret");
//        when(request.getParameter(bufferedReader.readLine())).thenReturn("");
////        when(bufferedReader.readLine()).thenReturn("first line").thenReturn("second line");
//
//        StringWriter stringWriter = new StringWriter();
//        PrintWriter writer = new PrintWriter(stringWriter);
//        when(response.getWriter()).thenReturn(writer);
//
//        new FileUploadDBServlet().doPost(request, response);

//        verify(request, atLeast(1)).getParameter("firstName"); // only if you want to verify username was called...
//        writer.flush(); // it may not have been flushed yet...
//        assertTrue(stringWriter.toString().contains("My expected string"));
    }
}