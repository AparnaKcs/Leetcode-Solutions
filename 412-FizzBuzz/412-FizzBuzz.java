// Last updated: 8/12/2026, 11:06:28 AM
class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String>  run = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0){
                run.add("FizzBuzz");
            }
            else if(i%3==0){
                run.add("Fizz");
            }
            else if(i%5==0){
                run.add("Buzz");
            }
            else{
                run.add(String.valueOf(i));
            }

        }
        return run;
    }
}