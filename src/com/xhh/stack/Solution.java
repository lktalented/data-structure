package com.xhh.stack;

/**
 * 括号匹配问题
 * luokai
 * 2018/11/29 0029 下午 5:57
 */
public class Solution {
    public  boolean isValid(String s){
        ArrayStack<Character>stack = new ArrayStack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('(' == c || '[' == c || '{' == c){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                Character topChar = stack.pop();
                if (topChar == '(' && c != ')'){
                    return false;
                }
                if (topChar == '[' && c != ']'){
                    return false;
                }
                if (topChar == '{' && c != '}'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("[{()}] 是否配对:"+new Solution().isValid("[{()}]"));
        System.out.println("[{(}]) 是否配对:"+new Solution().isValid("[{(}])"));
    }
}

