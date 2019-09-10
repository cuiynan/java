package com.springsource.cglib;

/**
 * @author cuiyingnan
 */
public class Dao implements IDao {

    @Override
    public void select(){
        System.out.println("select()  is  run");
    }

    @Override
    public void delete(){
        System.out.println("delete()  is  run");
    }

}
