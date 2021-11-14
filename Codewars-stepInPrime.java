class StepInPrimes {
  
      static boolean checkForPrime(long inputNumber) {
      
        boolean isItPrime = true;

        if(inputNumber <= 1) {
        
          isItPrime = false;

          return isItPrime;
        } else {
          for (int i = 2; i<= inputNumber/2; i++) {
            if ((inputNumber % i) == 0){
              isItPrime = false;
              break;
            }
          }

          return isItPrime;
        }
      }

    public static long[] step(int g, long m, long n) {
        // your code
      for (long i = m; i < n; i++) {
        if (checkForPrime(i) && checkForPrime(i+g)) {
          return new long[] {i, i + g};
        }
      }
      return null;
    }
}
