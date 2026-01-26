# Leetcode
之前刷题一直断断续续，没有养成一个刷题的习惯，建个仓库持续更新培养自己的刷题习惯
## 刷题遇到的技巧及反思：
1.  List<Boolean> ans = new ArrayList<>(); 这里的数据类型要写Boolean,同时不能直接用索引访问具体的值，要用get方法，ans.get(i)，如果想修改要用set(i,value)，添加用add(value)
2.  Set<Character>mp = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')); 可以用Set去这么写，写一个类似这样的字典，然后用mp.contains()去判断字符串中是否包含对应的值。
3.  Char [] a = s.toCharArray(); return new String(a); 一个是字符串转化为字符数组，这样方便遍历操作，一个是字符数组转换为字符串这样去返回字符串类型
