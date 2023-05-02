package Test;


import java.lang.reflect.Method;

public class ReflectionMain
{
 public static void main(String[] args) throws Exception
 {
    @SuppressWarnings("rawtypes")
	Class c=Class.forName("Test.Reflection");	
     Reflection r=(Reflection)c.newInstance();
    @SuppressWarnings("unchecked")
	Method m=c.getDeclaredMethod("show",null);
    m.setAccessible(true);
    m.invoke(r, null);
 }
}
