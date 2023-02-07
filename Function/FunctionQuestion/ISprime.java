// Define a method to find out if a number is prime or not.
static boolean Isprime(int a){    //a is parameter
  
        boolean result = true;    // default value of return varaible
  
        if (a==2){                // checking for 2
            result = true;
        }
        else{
        int fact = a/2;           // reducing the total factors ny half
        for (int i=2;i<=fact;i++){ // loop initaliized
            if(a%i==0){
                result = false;
            }
        }
    }
        return result;            // return
    }
