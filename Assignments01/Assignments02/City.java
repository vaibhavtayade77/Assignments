package Assignments02;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class City {
	String cityname;
	int citypopulation;
	int area;

	public City(String cityname, int citypopulation, int area) {
		this.cityname = cityname;
		this.citypopulation = citypopulation;
		this.area = area;

	}

	public static void main(String[] args) {

		{
			ArrayList<City> citylist = new ArrayList<City>();
			citylist.add(new City("Mumbai", 500000, 10000));
			citylist.add(new City("Nagpur", 450000, 12000));
			citylist.add(new City("Amravati", 300000, 9000));

			City Highpopulation = citylist.stream()
					.max((obj1, obj2) -> obj1.citypopulation > obj2.citypopulation ? 1 : -1).get();

			System.out.println("Highest Population in city " + Highpopulation.cityname);

			Set<Integer> citypp = citylist.stream().map(e -> e.citypopulation).collect(Collectors.toSet());
			System.out.println(citypp);

			City nameSet = citylist.stream().min((obj1, obj2) -> obj1.area > obj2.area ? 1 : -1).get();

			System.out.println("Least Area city is " + nameSet.cityname);

		}
	}
}
