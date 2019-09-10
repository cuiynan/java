package com.cc.java.serializable;

import java.io.*;
import java.util.Date;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/14 11:48
 **/
public class SerializableTest {
    public static void main(String[] args) {
        FileOutputStream f = null;//创建一个包含恢复对象(即对象进行反序列化信息)的”tmp”数据文件
        try {
            f = new FileOutputStream("tmp");
            ObjectOutputStream s = new ObjectOutputStream(f);
            User user = new User("name", "pass");
            s.writeObject(user); //写入字符串对象;
            s.writeObject(new Date()); //写入瞬态对象;
            s.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        FileInputStream in = null;
        try {
            in = new FileInputStream("tmp");
            ObjectInputStream s = new ObjectInputStream(in);
            Object obj = s.readObject();
            if (obj instanceof User) {
                Date date = (Date) s.readObject();
                User user2 = (User) obj; //恢复对象;
                System.out.println("反序列后：" + user2);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
