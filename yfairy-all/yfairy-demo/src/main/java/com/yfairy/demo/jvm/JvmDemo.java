package com.yfairy.demo.jvm;

public class JvmDemo {

	public static void main(String[] args) {
		/**
		 * 深入理解java虚拟机第2版 1.6实战自己编译jdk,22(43/460) 2.4，实战outofmemory50(71/460)
		 * 第3章:61(82/460) 判断对象是否存活的算法: 1.引用计数法 2.可达性算法 3.3垃圾收集算法:
		 * 1.标记-清除算法:先标记，然后统一清除，但是存在效率和内存块分配不均匀
		 * 2.复制算法:将内存安容量分为同样大小的两块，先用一块，用完了把不用清除的移到另外一块，<br>
		 * 清除用完的一块， 缺点:将内存缩小了一半<br>
		 * 3.标记-整理算法,先标记，然后把所有存活的对象移动到一端，然后清理后面的
		 * 4.分代收集算法:分为新生代，老年代,根据不同的代选择合适的算法,<br>
		 * ，新生代，每次收集时都有大批对象死去，使用复制算法回收，老年代，使用标记-清除，或标记整理<br>
		 * 3.5.8理解gc日志，89(110/460)
		 */
		System.out.println("hello");

	}

}
