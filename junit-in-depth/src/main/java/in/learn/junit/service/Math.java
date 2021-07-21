package in.learn.junit.service;

import java.util.List;
import java.util.stream.Collectors;

import org.yaml.snakeyaml.util.ArrayUtils;



public class Math {
	
	int sum(Integer[] j) {
		List<Integer> list = ArrayUtils.toUnmodifiableList(j);
		int sum = list.parallelStream().collect(Collectors.summingInt(Integer::intValue));
		return sum;
	}

}
