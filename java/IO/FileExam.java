package IO;

import java.io.File;

import javax.xml.crypto.Data;

import Inheritance.S;

public class FileExam {
  public static void main(String[]args){
    File f = new File("");
    if(f.exists()){
      System.out.println("존재합니다.");
      if(f.isDirectory()){
        System.out.println("**** 폴더 정보 ****");
      }

        String[]data=f.list();
        for(String s:data){
          System.out.println(s);
        }
        else{
          System.out.println("**** 파일 정보 ****");
          System.out.println("파일 이름 : " + f.getName());
          System.out.println("절대 경로 : "+f.getAbsolutePath());
          System.out.println("읽기 가능 : "+f.canRead());
          System.out.println("쓰기 가능 : "+f.canWrite());
          System.out.println("파일 용량 : "+f.length()+"byte");

          long time = f.lastModified();
          Date lastModifier = new Date(time);
          System.out.println("수정 날짜 : "+lastModifier);
          f.delete();
        }

    }
    else{
      System.out.println("없습니다.");
      f.mkdir();
    }
  }
}
