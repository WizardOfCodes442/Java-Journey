public class ReflectionDemo {
    public static void invokeMain() throws ClassNotFoundException,ExceptionInInitializerError,
        IllegalAccessException, IllegalArgumentsException, InvocationTargetException, 
        NoSuchMethodException, SecurityException {
            Class<?> distanceClass = Class.forName("Distance");
            String[] points = {"0", "0", "3", "4"};
            Method mainMethod = distanceClass.getMethod("main", String[].class);
            Object result = mainMethod.invoke(null, (Object) points);
        }
}