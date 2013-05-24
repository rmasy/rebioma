package org.rebioma.server.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.mapping.PersistentClass;

public class StringUtil {

  public static String capFirstLetter(String s) {
    return (s.charAt(0) + "").toUpperCase() + s.substring(1);
  }

  public static <C> boolean isString(Class<C> cl, String fieldName) {
    try {
      Field field = cl.getDeclaredField(fieldName);
      return field.getType().toString().equals(String.class.toString());
    } catch (SecurityException e) {

    } catch (NoSuchFieldException e) {

    }
    return false;
  }

  public static <C> boolean isType(Class<C> cl, String fieldName, Class<?> type) {
    try {
      Field field = cl.getDeclaredField(fieldName);
      return field.getType().toString().equals(type.toString());
    } catch (SecurityException e) {

    } catch (NoSuchFieldException e) {

    }
    return false;
  }
  
  /*public static String columnName(Class cl, String name) {
	    PersistentClass mapping = configuration.getClassMapping(cl.getClass().getName());
	    Property property = mapping.getProperty(name);
	    if(property.isComposite()){
	        Component comp = (Component) property.getValue();
	        property = comp.getProperty(StringHelper.unroot(name));
	        assert ! property.isComposite(); //go only one level down 
	    }
	    Iterator<?> columnIterator = property.getColumnIterator();
	    Column col = (Column) columnIterator.next();
	    assert ! columnIterator.hasNext();
	    return col.getName();
	}*/

  public static void main(String args[]) {
    List<Integer> ids = new ArrayList<Integer>();
    ids.add(1);
    ids.add(2);
    System.out.println((ids instanceof Collection<?>));
  }
}