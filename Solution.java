#include<bits/stdc++.h>
using namespace std;
#define LL long long
long long getCost (int X, int k, vector<int> price, int N) {
   set <int> s ; 
   for(auto i:price) s.insert(i) ;
   return X * max(0LL,(LL)s.size()-k) * 1LL ; 
}

int main() {

    ios::sync_with_stdio(0);
    cin.tie(0);
    int T;
    cin >> T;
    assert(T>=1 and T<=10);
    for(int t_i=0; t_i<T; t_i++)
    {
        int N;
        cin >> N;
        assert(N>=1 and N<=100000) ; 
        int k;
        cin >> k;
        assert(k>=1 and k<=N) ; 
        int X;
        cin >> X;
        assert(X>=1  and X<=1000000000) ; 
        vector<int> price(N);
        for(int i_price=0; i_price<N; i_price++)
        {  cin >> price[i_price];
           assert(price[i_price]>=1 and price[i_price]<=1000000000) ; 
        }

        long long out_;
        out_ = getCost(X, k, price, N);
        cout << out_;
        cout << "\n";
    }
}