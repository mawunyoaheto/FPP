package mpp_test.prob2;

import java.lang.reflect.Field;

//DO NOT MODIFY 
//The only purpose for this class is to support the toString 
//implementation in MyStringStack
public class Util {
	public static String toString(MyStringStack st) {
		String output = "";
		try {		
			Field[] flds = st.getClass().getDeclaredFields();
			Object current = st;  //current object; on first pass it's the Stack, after that it's a Node -- usually next node
			String val = null;
			
			//finds value stored in top node
			//"current" here is the stack itself
			for(Field f: flds) {
				if(f.getName().equals("top")) {
					f.setAccessible(true);
					current = f.get(current);
					if(current == null) {
						return output;
					} else {
						val = nextValue(current.getClass(), current);
					}
				}
			}
			//now "current" is the top node
			output += val + " ";
			output = assembleOutput(current, output);

		} catch(Exception e) {
			e.printStackTrace();
		}
		return output;
	}
	
	private static String assembleOutput(Object current, String output) throws Exception {
		while((current = nextNode(current.getClass(), current)) != null) {
			output += nextValue(current.getClass(), current) + " ";
		}
		return output;
	}
	
	
	public static Object nextNode(Class<?> cl, Object current) throws Exception {
		Field[] flds = cl.getDeclaredFields();
		Class c = null;
		Object node = null;
		Field found = null;
		for(Field f: flds) {
			if(f.getName().equals("next")) {
				f.setAccessible(true);
				node = f.get(current);
				c = f.getClass();
				found = f;
			}
		}
		return node;
	}
	
	public static String nextValue(Class<?> cl, Object current) throws Exception {
		Field[] flds = cl.getDeclaredFields();
		String val = "";
		for(Field f: flds) {
			if(f.getName().equals("value")) {
				f.setAccessible(true);
				Object curr = f.get(current);
				if(curr == null) val = "null";
				else val = curr.toString();
				//System.out.println(val);
			}
		}
		return val;
	}
}
