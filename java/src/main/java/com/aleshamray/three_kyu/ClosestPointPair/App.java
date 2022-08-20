package com.aleshamray.three_kyu.ClosestPointPair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
 * Given a number of points on a plane, your task is to find two points with the smallest distance between them in linearithmic O(n log n) time.
 * 
 * Example
 * 
 *   1  2  3  4  5  6  7  8  9
 * 1  
 * 2    . A
 * 3                . D
 * 4                   . F       
 * 5             . C
 * 6              
 * 7                . E
 * 8    . B
 * 9                   . G
 * 
 * 
 * For the plane above, the input will be:
 * 
 * [
 *  [2,2], // A
 *  [2,8], // B
 *  [5,5], // C
 *  [6,3], // D
 *  [6,7], // E
 *  [7,4], // F
 *  [7,9]  // G
 * ]
 * 
 * => closest pair is: [[6,3],[7,4]] or [[7,4],[6,3]]
 * (both answers are valid)
 */

public class App {
  public static void main(String[] args) {

		// List<Point> points = Arrays.asList(
		// 		new Point(2, 2), //A
		// 		new Point(2, 8), //B
		// 		new Point(5, 5), //C
		// 		new Point(6, 3), //D
		// 		new Point(6, 7), //E
		// 		new Point(7, 4), //F
		// 		new Point(7, 9)  //G
		// );


/* 
 * [
 *   (3687.775041, 2629.503220),
 *   (3777.091010, 2657.266289)
 * ]
 */
    List<Point> points = Arrays.asList( 
      new Point(3368.252392, 1495.093415),
      new Point(3842.428250, 1766.157118),
      new Point(5698.729835, 3562.249594),
      new Point(4654.834231, 1334.895435)
      // new Point(5078.558655, 3283.925274),
      // new Point(3514.774577, 3476.933981),
      // new Point(4863.389038, 543.832023),
      // new Point(4653.839721, 3946.275553),
      // new Point(3188.883410, 733.992763),
      // new Point(3843.064003, 1180.657621),
      // new Point(4496.287928, 830.560339),
      // new Point(6011.918704, 1838.549830),
      // new Point(3687.775041, 2629.503220),
      // new Point(4092.348207, 2037.720363),
      // new Point(5646.056025, 3796.019206),
      // new Point(4770.385179, 1508.359262),
      // new Point(2677.781456, 1444.436530),
      // new Point(3451.891408, 1025.549579),
      // new Point(5656.236234, 636.734307),
      // new Point(3777.091010, 2657.266289),
      // new Point(5935.934344, 829.284354),
      // new Point(5517.653624, 1564.226470),
      // new Point(3585.685705, 1496.312973),
      // new Point(3434.537117, 1831.731182),
      // new Point(2761.454582, 757.133402),
      // new Point(4099.394219, 764.812056),
      // new Point(2972.664621, 3165.991467),
      // new Point(3442.811010, 658.632931),
      // new Point(5290.354562, 3204.163531),
      // new Point(4704.563176, 1685.640033),
      // new Point(2668.006208, 3306.801098),
      // new Point(4636.327600, 801.304511),
      // new Point(3964.391842, 2343.860969),
      // new Point(5110.511896, 1424.696192),
      // new Point(5228.724556, 3984.344528),
      // new Point(5739.165343, 3808.976328),
      // new Point(4730.266483, 320.735586),
      // new Point(5225.115381, 1851.208699),
      // new Point(5288.968231, 1143.475084),
      // new Point(4113.053026, 1590.576645),
      // new Point(5073.040798, 3703.399364),
      // new Point(3798.319439, 355.432896),
      // new Point(6035.256442, 2242.360438),
      // new Point(3612.101480, 2412.528556),
      // new Point(3778.901001, 2880.093761),
      // new Point(4103.997162, 1717.639821),
      // new Point(2953.409612, 941.279725)
    );

    List<Point> result = App.closestPair(points);

    System.out.print("\n[\n");
    for (int i = 0; i < result.size(); i++) {
      Point point = result.get(i);
      if (i == result.size()-1) System.out.println("  " + point.toString());
      else System.out.println("  " + point.toString() + ",");
    }
    System.out.println("]\n");

  }

  public static Double distance(Point a, Point b) {
    double distance = 0.0;

    double bXMinusAXSquared = Math.pow(b.x-a.x, 2);
    double bYMinusAYSquared = Math.pow(b.y-a.y, 2);
    distance = Math.sqrt(bXMinusAXSquared + bYMinusAYSquared);

    return distance;
  }

	// public static List<Point> closestPair(List<Point> points) {

  //   double shortest = Double.MAX_VALUE;
  //   List<Point> result = null;

  //   for (int i = 0; i < points.size()-1; i++) {
  //     for (int j = i+1; j < points.size(); j++) {
  //       double currentDistance = App.distance(points.get(i), points.get(j));
  //       if (currentDistance < shortest) {
  //         shortest = currentDistance;

  //         result = Arrays.asList(
  //           points.get(i),
  //           points.get(j)
  //         );
  //       }
  //     }
  //   }

	// 	return result;
	// }

	public static List<Point> closestPair(List<Point> points) {

    double shortest = Double.MAX_VALUE;
    List<List<Point>> checkedPairs = new ArrayList<>();
    List<Point> result = null;

    for (int i = 0; i < points.size()-1; i++) {
      for (int j = i+1; j < points.size(); j++) {
        List<Point> currentPair = Arrays.asList(points.get(i), points.get(j));

        if (checkedPairs == null || !checkedPairs.contains(currentPair)) {
          checkedPairs.add(currentPair);
          double currentDistance = App.distance(points.get(i), points.get(j));
          if (currentDistance < shortest) {
            shortest = currentDistance;
            result = currentPair;
            }
          }
        }
      }

		return result;
	}
}
