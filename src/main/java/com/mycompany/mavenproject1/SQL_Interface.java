/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.sql.Connection;

/**
 *
 * @author Student
 */
public interface SQL_Interface extends AutoCloseable{ 
    
 Connection connect(String url,String username,String password);
String[][] select(String[] values);
boolean creatTable(String tableName,String columns);
int insert(String tableName,String columns,String[] Values);
// 0-> nothing inserted
// 1-> 1 row inserted
// 2-> 2 rows insertid
// etc.
// возвращает количество невведённых данных
int updateRows(String tableName,String column,String conditionColumn,String[] conditions, String values);

// UPDATE students SET name = CASE id
//                 WHEN 23 THEN 'Alexander'
//                 WHEN 24 THEN 'Sasha'
//                 WHEN 2 THEN 'Alex'
//                 ELSE name
//                 END
boolean updateColumns(String tableName,String[] column,String[] values,String conditions);
//UPDATE students SET name = 'Alexandr',date = ;2012-12-12' WHERE school_id = 23 OR id > 112 AND last name = 'Alexandr';
String[][] Select(String[] columns);
boolean delete(String tableName);
int deleteRows(String tableName,String condition);
boolean addColumn(String tableName,String collumn);//column = "name TEXT NOT NULL"
//drobColumn(String tableName,String collumn);
// close()

}

