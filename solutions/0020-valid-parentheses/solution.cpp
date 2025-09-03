class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        map<char,char> m = {{')','('},{'}','{'},{']','['}};
        for(char c : s){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }else if(st.empty()){
                return false;
            }else{
                auto it = m.find(c);
                if(it->second == st.top()){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.empty();
    }
};
