#include <bits/stdc++.h>

using namespace std;


int main() {
    int a[6][6],s;
    int m=INT_MIN;
    //int s;
    for(int i=0;i<6;i++)
        {
        for(int j=0;j<6;j++)
            {
            cin>>a[i][j];
        }
    }
  // int j;
    for(int i=0;i<4;i++)
        {
         // j=0;
        for(int j=0;j<4;j++)
            {
            s=(a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]);
            if(s>m)
                m=s;
        }
        
        
            }
    cout<<m;
    
    
    
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
