

```cpp
#include <bits/stdc++.h>

int next_[100000005];
void InitNext(string s){
    int j=-1;
    next_[0]=-1;
    for (int i = 1; i < s.length(); ++i) {
        while (j>-1&&s[j+1]!=s[i])
            j=next_[j];//回溯到s[j+1]==s[i]或j=-1的位置；
        if(s[j+1]==s[i])
            j++;//如果两个值相等则在原有的基础上加1；
        next_[i]=j;
    }
}
int KMP(string s,string s1,int pos){
    int j=-1;
    for (int i = 0; i < s.length(); ++i) {
        while (j>-1&&s1[j+1]!=s[i])
            j=next_[j];//回溯到s[j+1]==s[i]或j=-1的位置；
        if(s1[j+1]==s[i])
            j++;//如果模式串的值等于匹配串的值，模式串的为值向下移动一位；
        if(j==s1.length()-1){
            return i-j;
        }
    }
    return -1;
}
int main() {
    //freopen("data.in","r",stdin);
    string s,find;
    cin>>s>>find;
    InitNext(find);
    int n=KMP(s,find,0);
    cout<<n<<endl;
}
```

1.next数组的初始化：

next[i]的值为0~i子串的最大公共前后缀减1。

例如：

| i | 0 | 1 | 2 | 3 | 4 | 5 | 6 |
| - | - | - | - | - | - | - | - |
| string | a | b | a | b | a | c | a |
| next | -1 | -1 | 0 | 1 | 2 | -1 | 0 |


next[0],next[1],next[2],next[3],next[4],next[5],next[6]的0-i子串为"a","ab","aba","abab","ababa","ababac","ababaca"; 他们的最大公共前后缀为"","","a","ab","abc","","a";因此他们的值为{-1，-1，0，1，2，-1，0};