class Averager {
    public static void main(String[] arguments) {
        int sum = 0;
        
        if (arguments.length > 0 ) {
            for (int i = 0; i < arguments.length; i++){
                sum += Integer.parseInt(arguments[i]);
            }
            System.out.println("Sum = " + sum);
            System.out.println("Average = " (float) sum / arguments.length);

        }
    }
}