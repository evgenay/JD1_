package local.home.task02.main;

/* На плоскости ХОY задана своими координатами точка А. Указать, где она расположена 
 * (на какой оси или в каком координатном угле).
 */
public class Task16 {
	public static void main(String[] args) {

		int x = 2;
		int y = -3;

		if ((x == 0) && (y == 0)) {
			System.out.println("В начале координат");
		} else {
			if ((x == 0) && (y != 0)) {
				System.out.println("На оси Y");
			} else {
				if ((x != 0) && (y == 0)) {
					System.out.println("На оси X");
				} else {
					if ((x > 0) && (y > 0)) {
						System.out.println("I четверть");
					} else {
						if ((x < 0) && y > 0) {
							System.out.println("II четверть");
						} else {
							if ((x < 0) && (y < 0)) {
								System.out.println("III четверть");
							} else {
								System.out.println("IV четверть");
							}
						}
					}
				}
			}
		}
	}

}
