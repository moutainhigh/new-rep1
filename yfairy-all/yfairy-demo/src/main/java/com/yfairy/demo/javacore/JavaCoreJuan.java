package com.yfairy.demo.javacore;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaCoreJuan {

	public static void main(String[] args) throws CloneNotSupportedException {
		/**
		 * java核心技术卷<br>
		 * 第1章java程序设计概述17/720<br>
		 * 第2章java程序设计环境29/720<br>
		 * 安装java源文件和文档，即源码，<br>
		 * cd jdk path<br>
		 * mkdir src<br>
		 * cd src<br>
		 * jar xvf ../src.zip或windows中执行jar xvf ..\src.zip<br>
		 * 2.2选择开发环境34/720<br>
		 * 2.6建立并运行applet41/720<br>
		 * 第3章：java基本程序设计结构45/720<br>
		 * 与大多数语言一样，java中的注释不会在可执行文件，字节码中出现，<br>
		 * 只会在源码中看到，可以查看.class反编译文件看看有无注释<br>
		 * 基本数据类型：<br>
		 * java整型：byte(1字节),short(2字节),int (4字节),long(8字节)<br>
		 * 浮点类型:float(4字节),double(8字节)<br>
		 * double表示这种类型的精度是float的两倍，<br>
		 * char类型：char(2字节) boolean:1. JAVA规范没有明确指出boolean占几个字节 <br>
		 * 2.JVM规范指出boolean当做int处理，也就是4字节，boolean数组当做byte数组处理。<br>
		 * 3. JVM以计算机的字长作为最小处理单位。<br>
		 * 3.5.3位运算符57/720<br>
		 * 第4章对象与类107/720<br>
		 * 静态导入import static java.lang.System.*<br>
		 * 第5章：继承166/720<br>
		 * 5.1.7受保护访问183/720<br>
		 * 5.2 Object所有类的超类,会介绍object中的方法(重要)<br>
		 * 5.2.2相等测试与继承Object 中的equals方法,187/720<br>
		 * 5.5参数数量可变的方法205/720<br>
		 * 5.6枚举<br>
		 * 5.7反射<br>
		 * 第6章接口与内部类231/720<br>
		 * 为什么有了抽象类还要有接口:抽象类只能单根继承，实现,接口可实现多个<br>
		 * 6.2对象克隆<br>
		 * 6.3接口与回调243/720<br>
		 * 6.5动态代理263/720(重要)<br>
		 * 第7章图形程序设计269/720<br>
		 * 第10章：部署应用程序和applet442/720<br>
		 * 10.4.1属性文件476/720<br>
		 * 第11章异常，断言日志和调试487/720<br>
		 * 第12章：泛型程序设计543/720<br>
		 * 第13章：集合576/720<br>
		 * 第14章：多线程636/720<br>
		 */
		System.out.println("JavaCore");
		final int afinal = 5;
		// afinal=7;

		// JApplet
		// 数学运算:Math
		double n1 = 2;
		// 求平方根Math.sqrt()
		double n12 = Math.sqrt(n1);

		// 幂运算Math.pow()
		System.out.println(n1 + "的平方:" + Math.pow(n1, 2));
		System.out.println(n1 + "的平方根:" + n12);

		// 字符串常用api
		String s1 = "hello.suffix";
		System.out.println("是以某个字符串开始startsWith：" + s1.startsWith("he1"));

		System.out.println("是以某个字符串结尾endsWith：" + s1.endsWith("fix"));
		// 输入输出,console用于在控制台读取密码
		// Console console = System.console();
		// System.out.println("请输入密码:");
		// char[] pwd = console.readPassword();
		// System.out.println("密码:" + pwd);

		/**
		 * label 类似goto,可用于循环中跳转,用处不大<br>
		 * 声明lable,l1:<br>
		 * 使用break l1;或continue l1;<br>
		 */
		label1: for (int i = 0; i < 10; i++) {
			System.out.println("跳转到标签：label");

			for (int j = 0; j < 5; j++) {
				System.out.println("j:" + j);
				if (j > 2) {
					break label1;
				}
			}
		}
		System.out.println("111");

		// 数组
		int[] intarr = { 1, 2, 3, 4, 5 };
		for (int i : intarr) {
			System.out.println("数组i:" + i);
		}
		System.out.println("---------------------");
		int[] arr2 = Arrays.copyOf(intarr, intarr.length);
		for (int i : arr2) {
			System.out.println("数组复制i:" + i);
		}
		// Arrays.toString 显示数组中的数据
		System.out.println(Arrays.toString(arr2));
		// Arrays.binarySearch
		System.out.println("查找元素下标:" + Arrays.binarySearch(arr2, 3));

		// 静态导入import static java.lang.System.*;
		out.println("静态导入import static java.lang.System.*");

		/**
		 * object.equals(obj)方法用于检测一个对象是否等于另一个对象<br>
		 * java语言规范要求equals方法具有下面的特性<br>
		 * 1.自反性：对于任何非空引用，x.equals(x) 应该返回true<br>
		 * 2.对称性，x.equals(y)返回true则y.equals(x)也要返回true<br>
		 * 3.传递性 ,4一致性<br>
		 */
		class StudentEqDemo {

			private String name;

			@Override
			public boolean equals(Object obj) {
				System.out.println("---------------");
				System.out.println("重写equals");
				System.out.println("object.equals(obj)方法用于检测一个对象是否等于另一个对象");
				if (null == obj) {
					return false;
				}
				if (this == obj)
					return true;
				return false;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		Object object = new Object();
		// object.equals(obj)
		//
		StudentEqDemo se1 = new StudentEqDemo();
		StudentEqDemo se2 = new StudentEqDemo();
		System.out.println(se1.equals(se2));
		System.out.println(se1.equals(null));
		System.out.println(se1.equals(se1));
		// Objects.equals(a, b)

		/**
		 * 使用sort(a)方法排序<br>
		 * 该对象要实现Comparator接口,重写compare方法，当a<b返回-1,相等返回0,>返回1
		 */
		List<ManSort> manSorts = new ArrayList<>();
		manSorts.add(new ManSort("w李思", 12));
		manSorts.add(new ManSort("e张三", 11));
		manSorts.add(new ManSort("a王五", 15));
		ManSort comparator = new ManSort();
		manSorts.sort(comparator);
		for (ManSort manSort : manSorts) {
			System.out.println(manSort);
		}
		// instanceof 判断是否是某种类型，比如接口，类
		if (comparator instanceof Cloneable) {
			System.out.println("comparator instanceof Cloneable");
		}
		// 实现Cloneable接口,代表可使用clone
		ManSort source = new ManSort("张1", 19);
		ManSort clone1 = (ManSort) source.clone();
		System.out.println("source:" + source);
		System.out.println(clone1);

		// 6.4.4局部内部类 255/720
		// 局部内部类不能声明访问类型，他只在一段代码块中有效
		// Illegal modifier for the local class JubuLei; only abstract or final
		// is permitted
		final String var1 = "var1";
		class JubuLei {
			private String jubuName;

			public String getJubuName() {
				System.out.println("局部内部类访问final变量:" + var1);
				return jubuName;
			}

			public void setJubuName(String jubuName) {
				this.jubuName = jubuName;
			}
		}
		JubuLei jubuLei = new JubuLei();
		jubuLei.setJubuName("name");
		System.out.println(jubuLei.getJubuName());
	}

}
