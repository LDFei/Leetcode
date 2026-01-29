# Leetcode
之前刷题一直断断续续，没有养成一个刷题的习惯，建个仓库持续更新培养自己的刷题习惯
## 刷题遇到的Java技巧及反思：
1.  ```List<Boolean> ans = new ArrayList<>(); 这里的数据类型要写Boolean,同时不能直接用索引访问具体的值，要用get方法，ans.get(i)，如果想修改要用set(i,value)，添加用add(value)```
2.  ```Set<Character>mp = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')); 可以用Set去这么写，写一个类似这样的字典，然后用mp.contains()去判断字符串中是否包含对应的值。```
3.  ```Char [] a = s.toCharArray(); return new String(a); 一个是字符串转化为字符数组，这样方便遍历操作，一个是字符数组转换为字符串这样去返回字符串类型```
4.  ```StringBuilder a = new StringBuilder();注意这里没有<>的泛型, a.setLength(0);这个方法是可以初始化StringBuilder的，a.append("abc")是往后插入字符串，a.insert(0,"abc")是往前插入字符串，a.toString()是把StringBuilder转化为字符串```
5.  ```int[] arr = new int[10];Arrays.fill(arr, 1);初始化赋值的api方法,当然也可以用for循环```






## SQL语句理解及反思：
1.  ```链接分外连接和内连接，外连接是取出所有数据，左外是以左表为基准，优先把左表的数据拿出来，右表没有的话默认为null，内连接是取出交集的数据，左表没有的右表数据，右表没有的左表数据都取不到```
