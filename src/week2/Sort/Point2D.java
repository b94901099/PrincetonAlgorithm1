package week2.Sort;

import java.util.Arrays;
import java.util.Stack;

public class Point2D {
	private final double x;
	private final double y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static int ccw(Point2D a, Point2D b, Point2D c) {
		double area2 = (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x);
		if (area2 < 0)
			return -1;
		else if (area2 > 0)
			return 1;
		else
			return 0;
	}

	public static Stack<Point2D> convexHull(Point2D[] points) {
		Stack<Point2D> hull = new Stack<Point2D>();
		// Arrays.sort(points, Point2D);
		// Arrays.sort(points, Point2D);
		hull.push(points[0]);
		hull.push(points[1]);
		for (int i = 2; i < points.length; i++) {
			Point2D top = hull.pop();
			while (Point2D.ccw(hull.peek(), top, points[i]) <= 0)
				top = hull.pop();
			hull.push(top);
			hull.push(points[i]);
		}
		
		return hull;
	}
}
