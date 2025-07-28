class Solve
{
      // The first argument is the number of bits. You need to save all binary strings in the ArrayList passed as 4th argument named strs.
    // Dont print the strings as they will be printed after needed processing (sorting in ascending order) at back end.
      // i is initially passed as 0, currStr is a char array to store the current String.
      
    
    void solve(char temp[], int i, ArrayList<String> strs,int n){
        if(i==n){
            String str = new String(temp);
            strs.add(str);
            return;
        }
        temp[i]='0';
        solve(temp,i+1,strs,n);
        
        temp[i]='1';
        solve(temp,i+1,strs,n);
        
        
    }
    void generateAllStrings(int n, int i, char currStr[], ArrayList<String> strs){ 
      // Write your code here
        
        solve(currStr,i,strs,n);
    } 
}
