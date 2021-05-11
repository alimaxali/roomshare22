/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomshare;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
//import javafx.scene.chart.PieChart;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;

/**
 *String idtest="0";
String nametest="0";
String emailtest="0";
String phonetest="0";
String Gendertest="0";
String Countrytest="0";
String Date_of_Birthtest="0";

 * @author ali01
 */
public class facebook_get_frainds {
   // public static String data_get_frands[];
     public static void get_data_frainds(String idtest,String nametest,String emailtest,String phonetest,String Gendertest,String Countrytest,String Date_of_Birthtest,String Token ) {
           String query_url = "https://graph.facebook.com/v10.0/me/friends?fields=email,id,gender,name,mobile_phone,birthday,location&access_token="+Token;
         //  String json = "{ \"id\" : 123 }";
           try {
           URL url = new URL(query_url);
           HttpURLConnection conn = (HttpURLConnection) url.openConnection();
 
           conn.setConnectTimeout(5000);
           //conn.setRequestProperty("Content-Type", "apcplication/json; charset=UTF-8");
           conn.setDoOutput(true);
           conn.setDoInput(true);
           conn.setRequestMethod("GET");
          // OutputStream os = conn.getOutputStream();
          // os.write(json.getBytes("UTF-8"));
          // os.close(); 
           // read the response
           InputStream in = new BufferedInputStream(conn.getInputStream());
           String result = IOUtils.toString(in, "UTF-8");
          // System.out.println(result);
           
           
           org.json.JSONObject myResponse = new org.json.JSONObject(result);
           
           
         //  System.out.println("jsonrpc- "+myResponse.getString("jsonrpc"));
          // System.out.println("id- "+myResponse.get("name"));
          // System.out.println("result- "+myResponse.getString("result"));
                   JSONArray subjects = (JSONArray)myResponse.get("data");
              int i = 0;  
             //  DefaultTableModel data_list =(DefaultTableModel)data_get.getmodel();

   while (i < 99999) {
          //  System.out.println(subjects.get(i));
            
          org.json.JSONObject myResponse2 = new org.json.JSONObject(subjects.get(i).toString());
          System.out.println("result- "+myResponse2.get("id"));
        //  String w = myResponse2.get("id").toString();
                  //  data_get_frands[2][i]= myResponse2.get("name").toString();
                  //  data_get_frands[3][i] = myResponse2.get("email").toString();
                  //  data_get_frands[4][i] = myResponse2.get("mobile_phone").toString();
                   // data_get_frands[5][i] = myResponse2.get("gender").toString();
                   // data_get_frands[6][i] = myResponse2.get("birthday").toString();
                    //data_get_frands[7][i] = myResponse2.get("birthday").toString();
                    String idtest1;
                    String nametest1;
                    String emailtest1;
                    String phonetest1;
                    String Gendertest1;
                    String Countrytest1;
                    String Date_of_Birthtest1;

                    if (idtest=="1"){try{ idtest1 = myResponse2.get("id").toString();}catch(Exception e){idtest1 = "0";}}else{idtest1 = null;}
                    if (nametest=="1"){try{ nametest1 = myResponse2.get("name").toString();}catch(Exception e){nametest1 = "0";}}else{nametest1 = null;}
                    if (emailtest=="1"){try{ emailtest1 = myResponse2.get("email").toString();}catch(Exception e){emailtest1 = "0";}}else{emailtest1 = null;}
                    if (phonetest=="1"){try{ phonetest1 = myResponse2.get("mobile_phone").toString();}catch(Exception e){phonetest1 = "0";}}else{phonetest1 = null;}
                    if (Gendertest=="1"){try{ Gendertest1 = myResponse2.get("gender").toString();}catch(Exception e){Gendertest1 = "0";}}else{Gendertest1 = null;}
                    if (Countrytest=="1"){try{org.json.JSONObject myResponse22 = new org.json.JSONObject(myResponse2.get("location").toString());Countrytest1 = myResponse22.get("name").toString();}catch(Exception e){Countrytest1 = "0";}}else{Countrytest1 = null;}
                    if (Date_of_Birthtest=="1"){try{ Date_of_Birthtest1 = myResponse2.get("birthday").toString();}catch(Exception e){Date_of_Birthtest1 = "0";}}else{Date_of_Birthtest1 = null;}


                    
                    //  String data_get_frands[]={"lll","kkkk"};
                    String data_get_frands[]= {idtest1,nametest1,emailtest1,phonetest1,Gendertest1,Countrytest1,Date_of_Birthtest1};
         facebook_get.data_list.addRow(data_get_frands);

            i++;
         }

           in.close();
           conn.disconnect();
           } catch (Exception e) {
   			System.out.println(e);
   		}
	}
     public static void get_data_fraindsfrainds(String idtest,String nametest,String emailtest,String phonetest,String Gendertest,String Countrytest,String Date_of_Birthtest,String Token ) {
           String query_url = "https://graph.facebook.com/v10.0/me/friends?fields=email,id,gender,name,mobile_phone,birthday,location&access_token="+Token;
         //  String json = "{ \"id\" : 123 }";
           try {
           URL url = new URL(query_url);
           HttpURLConnection conn = (HttpURLConnection) url.openConnection();
 
           conn.setConnectTimeout(5000);
           //conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
           conn.setDoOutput(true);
           conn.setDoInput(true);
           conn.setRequestMethod("GET");
          // OutputStream os = conn.getOutputStream();
          // os.write(json.getBytes("UTF-8"));
          // os.close(); 
           // read the response
           InputStream in = new BufferedInputStream(conn.getInputStream());
           String result = IOUtils.toString(in, "UTF-8");
          // System.out.println(result);
           
           
           org.json.JSONObject myResponse = new org.json.JSONObject(result);
           
           
         //  System.out.println("jsonrpc- "+myResponse.getString("jsonrpc"));
          // System.out.println("id- "+myResponse.get("name"));
          // System.out.println("result- "+myResponse.getString("result"));
                   JSONArray subjects = (JSONArray)myResponse.get("data");
              int i = 0;  
             //  DefaultTableModel data_list =(DefaultTableModel)data_get.getmodel();

   while (i < 99999) {
          //  System.out.println(subjects.get(i));
            
          org.json.JSONObject myResponse2 = new org.json.JSONObject(subjects.get(i).toString());
          //System.out.println("result- "+myResponse2.get("id"));
        //  String w = myResponse2.get("id").toString();
                  //  data_get_frands[2][i]= myResponse2.get("name").toString();
                  //  data_get_frands[3][i] = myResponse2.get("email").toString();
                  //  data_get_frands[4][i] = myResponse2.get("mobile_phone").toString();
                   // data_get_frands[5][i] = myResponse2.get("gender").toString();
                   // data_get_frands[6][i] = myResponse2.get("birthday").toString();
                    //data_get_frands[7][i] = myResponse2.get("birthday").toString();
                    String idtest1;
                    String nametest1;
                    String emailtest1;
                    String phonetest1;
                    String Gendertest1;
                    String Countrytest1;
                    String Date_of_Birthtest1;

                    if (idtest=="1"){try{ idtest1 = myResponse2.get("id").toString();}catch(Exception e){idtest1 = "0";}}else{idtest1 = null;}
                    if (nametest=="1"){try{ nametest1 = myResponse2.get("name").toString();}catch(Exception e){nametest1 = "0";}}else{nametest1 = null;}
                    if (emailtest=="1"){try{ emailtest1 = myResponse2.get("email").toString();}catch(Exception e){emailtest1 = "0";}}else{emailtest1 = null;}
                    if (phonetest=="1"){try{ phonetest1 = myResponse2.get("mobile_phone").toString();}catch(Exception e){phonetest1 = "0";}}else{phonetest1 = null;}
                    if (Gendertest=="1"){try{ Gendertest1 = myResponse2.get("gender").toString();}catch(Exception e){Gendertest1 = "0";}}else{Gendertest1 = null;}
                    if (Countrytest=="1"){try{org.json.JSONObject myResponse22 = new org.json.JSONObject(myResponse2.get("location").toString());Countrytest1 = myResponse22.get("name").toString();}catch(Exception e){Countrytest1 = "0";}}else{Countrytest1 = null;}
                    if (Date_of_Birthtest=="1"){try{ Date_of_Birthtest1 = myResponse2.get("birthday").toString();}catch(Exception e){Date_of_Birthtest1 = "0";}}else{Date_of_Birthtest1 = null;}
          System.out.println(idtest1);
i++;
           String query_url1 = "https://graph.facebook.com/v10.0/"+idtest1+"/friends?fields=email,id,gender,name,mobile_phone,birthday,location&access_token="+Token;
try {
           URL url1 = new URL(query_url1);
           HttpURLConnection conn1 = (HttpURLConnection) url1.openConnection();
 
           conn1.setConnectTimeout(5000);
           //conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
           conn1.setDoOutput(true);
           conn1.setDoInput(true);
           conn1.setRequestMethod("GET");
          // OutputStream os = conn.getOutputStream();
          // os.write(json.getBytes("UTF-8"));
          // os.close(); 
           // read the response
           InputStream in1 = new BufferedInputStream(conn1.getInputStream());
           String result1 = IOUtils.toString(in1, "UTF-8");
          // System.out.println(result);
           
           
           org.json.JSONObject myResponse1 = new org.json.JSONObject(result1);
           
           
         //  System.out.println("jsonrpc- "+myResponse.getString("jsonrpc"));
          // System.out.println("id- "+myResponse.get("name"));
          // System.out.println("result- "+myResponse.getString("result"));
                   JSONArray subjects1 = (JSONArray)myResponse1.get("data");
              int i1 = 0;  
             //  DefaultTableModel data_list =(DefaultTableModel)data_get.getmodel();

   while (i1 < 99999) {
       
                     org.json.JSONObject myResponse21 = new org.json.JSONObject(subjects1.get(i1).toString());
          //System.out.println("result- "+myResponse2.get("id"));
        //  String w = myResponse2.get("id").toString();
          i1++;
               
                    String idtest11;
                    String nametest11;
                    String emailtest11;
                    String phonetest11;
                    String Gendertest11;
                    String Countrytest11;
                    String Date_of_Birthtest11;
                             System.out.println(myResponse21+"555555555555");

                    if (idtest=="1"){try{ idtest11 = myResponse21.get("id").toString();}catch(Exception e){idtest11 = "0";}}else{idtest11 = null;}
                    if (nametest=="1"){try{ nametest11 = myResponse21.get("name").toString();}catch(Exception e){nametest11 = "0";}}else{nametest11 = null;}
                    if (emailtest=="1"){try{ emailtest11 = myResponse21.get("email").toString();}catch(Exception e){emailtest11 = "0";}}else{emailtest11 = null;}
                    if (phonetest=="1"){try{ phonetest11 = myResponse21.get("mobile_phone").toString();}catch(Exception e){phonetest11 = "0";}}else{phonetest11 = null;}
                    if (Gendertest=="1"){try{ Gendertest11 = myResponse21.get("gender").toString();}catch(Exception e){Gendertest11 = "0";}}else{Gendertest11 = null;}
                    if (Countrytest=="1"){try{org.json.JSONObject myResponse222 = new org.json.JSONObject(myResponse21.get("location").toString());Countrytest11 = myResponse222.get("name").toString();}catch(Exception e){Countrytest11 = "0";}}else{Countrytest11 = null;}
                    if (Date_of_Birthtest=="1"){try{ Date_of_Birthtest11 = myResponse21.get("birthday").toString();}catch(Exception e){Date_of_Birthtest11 = "0";}}else{Date_of_Birthtest11 = null;}

                    String data_get_frands1[]= {idtest11,nametest11,emailtest11,phonetest11,Gendertest11,Countrytest11,Date_of_Birthtest11};
         facebook_get.data_list.addRow(data_get_frands1);

          
         }
       
   
              in1.close();
           conn1.disconnect();
           } catch (Exception e) {
   			System.out.println(e);
   		}
           
                    //  String data_get_frands[]={"lll","kkkk"};
        
   }
           in.close();
           conn.disconnect();
           } catch (Exception e) {
   			System.out.println(e);
   		}
	}
}
