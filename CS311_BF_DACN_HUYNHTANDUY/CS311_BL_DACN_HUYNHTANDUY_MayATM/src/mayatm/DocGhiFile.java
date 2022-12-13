package mayatm;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocGhiFile extends javax.swing.JFrame{
    protected void docFile(List<User> a){
    try{
            File f = new File("ListUser.txt");
            if(f.exists()){
                Scanner read = new Scanner(f);
                while(read.hasNext()){
                    Scanner line = new Scanner(read.nextLine());
                    String cmnd="",name="",userName="",bankName="",cardNumber="",pass="";
                    long money;
                    cmnd = line.next();
                    userName = line.next();
                    pass = line.next();
                    bankName = line.next();
                    cardNumber = line.next();
                    money = line.nextLong();
                    while(line.hasNext()){
                        name = name + line.next() + " ";
                    }
                    name.trim();
                    a.add(new User(name,cmnd,userName,pass,bankName,cardNumber,money));
                }
            } else {
                System.out.println("Khong ton tai file");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
    }
    protected void ghiFile(List<User> a){
        try{
            File f = new File("ListUser.txt");
            if(f.exists()){
                PrintStream out = new PrintStream(f);
                for(User x: a){
                    out.println(x);
                }
            } else {
                System.out.println("Khong ton tai file");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
