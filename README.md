# Leetcode
之前刷题一直断断续续，没有养成一个刷题的习惯，建个仓库持续更新培养自己的刷题习惯
## 刷题遇到的Java技巧及反思：
1.  ```List<Boolean> ans = new ArrayList<>(); 这里的数据类型要写Boolean,同时不能直接用索引访问具体的值，要用get方法，ans.get(i)，如果想修改要用set(i,value)，添加用add(value)```
2.  ```Set<Character>mp = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')); 可以用Set去这么写，写一个类似这样的字典，然后用mp.contains()去判断字符串中是否包含对应的值。st.put是添加```
3.  ```Char [] a = s.toCharArray(); return new String(a); 一个是字符串转化为字符数组，这样方便遍历操作，一个是字符数组转换为字符串这样去返回字符串类型```
4.  ```StringBuilder a = new StringBuilder();注意这里没有<>的泛型, a.setLength(0);这个方法是可以初始化StringBuilder的，a.append("abc")是往后插入字符串，a.insert(0,"abc")是往前插入字符串，a.toString()是把StringBuilder转化为字符串,a.charAt(i)是获取字符串中第i个字符，a.substring(i,j)是获取字符串中i到j的字符,a.length()是获取字符串的长度```
5.  ```int[] arr = new int[10];Arrays.fill(arr, 1);初始化赋值的api方法,当然也可以用for循环,Arrays.sort(arr);排序,Arrays.equals(arr1,arr2)可以比较两个数组是否相等```
6.  ```Integer.MAX_VALUE是int的最大值，Integer.MIN_VALUE是最小值```
7.  ```Map<Integer,Integer> mp = new HashMap<>(); mp.put(nums[i],mp.getOrDefault(nums[i],0) + 1)Java的map的put且值自增的方法```
8.  ```遇到二维数组List<List<Integer>> ans = new ArrayList<>());，我们的是不好直接操作这个二维数组的，一般的做法是，再建几个一维数组，然后把一维数组的元素写进去之后，ans.add(一维数组),这样就可以了，如果想遍历，那么直接ans.get(i).get(j)就可以了```



## SQL语句理解及反思：
1.  ```链接分外连接和内连接，外连接是取出所有数据，左外是以左表为基准，优先把左表的数据拿出来，右表没有的话默认为null，内连接是取出交集的数据，左表没有右表的数据，右表没有左表的数据都取不到```
2.  ```如果concat语句里的三个字段有一个为Null则这个数据里是否包含我要查询的字段都会查不出来因为'A' + 'B' + NULL = NULL 用||,+,concat都会有这个问题，但是我们用or就不会出现这种问题，但是我们写的sql需要兼容各类语言，一般使用concat所以我们需要限制数据库的表字段为非空字段。```
3.  ```如果只有一张表我们需要跟据这张表的一个字段的关系查询数据，比如我需要比前一天的日期的温度值大，这个时候我就需要这个表与自己的日期字段比较，这个时候我们可以用内连接的方式，然后在on这个字段后面加上筛选条件，比如on t1.date = t2.date + 1，但是日期的比较如果单纯的+1遇到月末就会漏数据，所以有个datediff这个函数可以传进去两个日期，返回差值```
4.  ```avg()函数可以计算平均值，round(a,3)让a字段保留三位小数，count()函数可以统计行数```