# java_base
最近在狂刷题......
###局部内类：
	当局部内部类使用了其所在函数的局部变量时，该局部变量需要是final
**为什么**
	
	分析内存图，就可知道
###匿名内部类：
 **前提条件**	
	
	接口的子类对象  类的子类对象
##异常
####程序在运行时出现的不正常情况

**异常的由来：**

 java把程序运行时出现的各种不正常情况也看成了对象，提取属性和方法进行描述，比如异常名称，异常信息，异常发生的位置，从而形成了各种异常类


	public class Demo5 {
	
	public static void main(String[] args) {
		System.out.println(4/0);//ArithmeticException: 说明异常被看成对象
	}
	}

###异常的分类
- 一类是严重的问题: Error 
   	    
 	**不需要进行处理**

- 一类是不严重的问题: 
	
	**需要进行处理**
###异常构架
Throwable

 --- Error

 --- Exception

**jvm处理异常的原理**

当发生异常时，因为异常类已经在jvm内部定义好了，所以系统会自动创建该异常对象，因为main函数不能处理异常功能，jvm默认的处理方式就是调用异常类对象的**printStackTrace方法**， 打印出异常名称，异常信息，以及异常发生的位置，然后程序中断，不执行后边的程序代码

 使用throws声明函数可能发生异常，那么调用必须处理，处理的两种方式 ：

- 使用 try{} catch(Exception e) {}
- 继续使用throws声明异常
###自定义异常
在类内部使用throw抛出异常类对象，那么必须处理

处理方式有两种:

- 使用try{} catch(异常类 参数) 处理
- 使用throws声明抛出

###throw 和throws的对比

throw 后边是异常类对象，在函数内部使用

throws 后边是异常类，在函数后边使用

###RuntimeException或其子类具备以下特点

- 使用throws声明了异常，不处理编译也通过
- 使用throw抛出了异常， 不处理编译也通过

非RuntimeException具备以下特点
- 使用throws声明了异常，必须处理，处理方式有两种
- 使用throw抛出了异常，必须处理，处理方式两种


- RuntimeException及其子类是编译时不检测的异常

- 非RuntimeException是编译时检测的异常

java认为当发生运行时异常时，程序就该中断，不该处理，因为运行时异常通常都是传递数据错误造成的

try的三种组合 :

- try {} catch() {}
- try {} catch{} finally {}
- try {} finally{}

     //和异常没有关系
		try {
			//猎取资源
		} finally {
			//释放资源
		}
	
###字符串
**String**

字符串是常量，它们的值在创建之后不能更改
**在常量池中存储**

String s1 = "1000phone"
String s2 = "1000phone"


**原理:** 定义s1时，先去常量池中看有没有"1000phone"，没有，所以创建一个

定义s2时，先去常量池中看有没有"1000phone"，有， 所有直接使用有的

