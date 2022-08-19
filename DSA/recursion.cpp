#include "bits/stdc++.h"
using namespace std;
// VERY IMPORTANT: base case
// Otherwise it will never stop

// TRUST the  function -> Recursive leap of faith
// prints: hello
// void say_hello(int n)
// {
    // if(n==0){  // Stopping case or Base Case or Initial Condition
    //     return;// STOPPED
    // }
    // cout<<"Hello"<<n<<"\n"; // printted once already
    // say_hello(n-1);

    // if (n==0){
    //     return;
    // }
    // say_hello (n - 1); // First n-1 lines
    // cout << "Hello" << n << "\n";
// }


// int sum(int n){
//     if(n==0){
//         return 0;
//     }
//     int left_part=sum(n-1);
//     return left_part+n;

// }

// int sum_digits(int n){
//     if(n==0){
//         return 0;
//     }
//     int last_digit=n%10;
//     int remaining=n/10;
//     cout<<remaining<<" "<<last_digit<<"\n";
//     return sum_digits(remaining)+last_digit;
// }

// void pattern_print(int n){
//     if(n==0){
//         return;
//     }
//     pattern_print(n-1);
//     for(int i=1;i<=n;i++){
//         cout<<i<<" ";
//     }
//     cout<<"\n";
// }

// void pattern_both(int n){
//     if(n==1){
//         cout<<1<<"\n";
//         return;
//     }
//     for(int i=1;i<=n;i++){
//         cout<<i<<" ";
//     }
//     cout<<"\n";

//     pattern_both(n-1);

//     for(int i=1;i<=n;i++){
//         cout<<i<<" ";
//     }
//     cout<<"\n";
// }

// 1,2,3,4,5,6,7,8,9,10,.....
// 0,1,1,2,3,5,8,13,21,34,55,89....
int fib(int n){
    if(n==2){
        return 1;
    }
    if(n==1){
        return 0;
    }

    return fib(n-1)+fib(n-2);

}
int main()
{
    // cout<<sum(10);
    // say_hello(10);

    // cout<<sum_digits(1246);

    // pattern_print(6);


    // pattern_both(8);
    
    cout<<fib(8);


}