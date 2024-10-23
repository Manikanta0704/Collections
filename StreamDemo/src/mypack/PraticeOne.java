package mypack;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;

public class PraticeOne {
	public static void main(String[] ar) {
//		List<Integer> nums=Arrays.asList(4,9,0,5,7,8);
//		System.out.println(nums);
//		System.out.println(nums);

//		List<Integer> nums=Arrays.asList(4,9,0,5,7,8);
//		Stream<Integer> data =nums.stream();
//		data.forEach(n->System.out.print(n+" "));
//		data.forEach(n->System.out.print(n));

//		List<Integer> nums=Arrays.asList(4,9,0,5,7,8);
//		Stream<Integer> data =nums.stream();
//		long count=data.count();
//		System.out.println(count);

//		List<Integer> nums=Arrays.asList(4,9,0,5,7,8);
//		Stream<Integer> data =nums.stream();
//		Stream<Integer> sortedData=data.sorted();
//		sortedData.forEach(n->System.out.println(n));

//		List<Integer> nums=Arrays.asList(4,9,0,5,7,8);
//		Stream<Integer> data =nums.stream();
//		Stream<Integer> mapdata=data.map(n->n*2);
//		mapdata.forEach(a->System.out.println(a));

//		List<Integer> nums=Arrays.asList(4,9,0,5,7,8);
//		Stream<Integer> data =nums.stream();
//		nums.stream()
//			.map(n->n*2)
//			.forEach(n->System.out.println(n));

//		List<Integer> nums=Arrays.asList(4,9,0,5,7,8);
//		Stream<Integer> data =nums.stream();
//		nums.stream()
//			.sorted()
//			.map(n->n*2)
//			.forEach(n->System.out.println(n));

//		List<Integer> nums=Arrays.asList(4,9,0,5,7,8);
//		Stream<Integer> data =nums.stream();
//		nums.stream()
//			.filter(n->n%2==1)
//			.sorted()
//			.map(n->n*2)
//			.forEach(n->System.out.println(n));

		List<Integer> nums=Arrays.asList(4,9,0,5,7,8);
		Stream<Integer> data =nums.stream();
		int result=nums.stream()
			.filter(n->n%2==1)                //9,5,7
			.sorted()                         //5,7,9
			.map(n->n*2)                      //10,14,18
			.reduce(0,(c,e)->c+e);            //10+14+18
		System.out.println(result);           //45

		
//		List<Integer> list   = Arrays.asList(7, 4, 11, 47, 2, 4);
//		Stream<Integer> data = list.stream();
//		data.sorted().map(n->n*2).forEach(n -> System.out.println(n));
		
		
	}
}
