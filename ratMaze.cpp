class Solution {
  public:
  
    bool safe(vector<vector<int>>& visited, int x, int y, vector<vector<int>>& mat, int n){
        if((x<n && x>=0) && (y<n && y>=0) && visited[x][y]==0 && mat[x][y]==1)
            return true;
        return false;
    }
  
    void solve(vector<vector<int>>&mat, vector<vector<int>>& visited,int n, string path, vector<string> &ans, int x, int y){
        // base case
        if(x==mat.size()-1 && y==mat.size()-1){
            ans.push_back(path);
        }
        visited[x][y]=1;
        //down
        int newX = x+1;
        int newY = y;
        if(safe(visited,newX,newY,mat,n)){
            path.push_back('D');
            solve(mat,visited,n,path,ans,newX,newY);
            path.pop_back();
        }
        // left
        newX = x;
        newY = y-1;
        if(safe(visited,newX,newY,mat,n)){
            path.push_back('L');
            solve(mat,visited,n,path,ans,newX,newY);
            path.pop_back();
        }
        //right
        newX = x;
        newY = y+1;
        if(safe(visited,newX,newY,mat,n)){
            path.push_back('R');
            solve(mat,visited,n,path,ans,newX,newY);
            path.pop_back();
        }
        // up
        newX = x-1;
        newY = y;
        if(safe(visited,newX,newY,mat,n)){
            path.push_back('U');
            solve(mat,visited,n,path,ans,newX,newY);
            path.pop_back();
        }
        visited[x][y]=0;
    }
    
    vector<string> findPath(vector<vector<int>> &mat) {
         vector<string> ans;
        if(mat[0][0] == 0){
            return ans;
        }
        int x = 0;
        int y = 0;
        vector<vector<int>> visited = mat;
        for(int i=0;i<mat.size();i++){
            for(int j=0;j<mat.size();j++){
                visited[i][j]=0;
            }
        }
        int n = mat.size();
        string path = "";
        solve(mat,visited,n,path,ans,x,y);
        sort(ans.begin(),ans.end());
        return ans;
    }
};
