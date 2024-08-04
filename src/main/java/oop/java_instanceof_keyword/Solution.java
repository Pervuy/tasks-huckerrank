package oop.java_instanceof_keyword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Student{}
class Rockstar{}
class Hacker{}


public class Solution{

  static String count(ArrayList<Object> mylist){
    int a = 0,b = 0,c = 0;
    for (Object element : mylist) {
      if (element instanceof Student) a++;
      if (element instanceof Rockstar) b++;
      if (element instanceof Hacker) c++;
    }
    return Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
  }

  public static void main(String []args) throws IOException {
    ArrayList<Object> mylist = new ArrayList();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bufferedReader.readLine());
    for(int i=0; i<t; i++){
      String s = bufferedReader.readLine();
      if(s.equals("Student")) mylist.add(new Student());
      if(s.equals("Rockstar")) mylist.add(new Rockstar());
      if(s.equals("Hacker")) mylist.add(new Hacker());
    }
    System.out.println(count(mylist));
  }
}
