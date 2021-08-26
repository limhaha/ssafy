
public class Mirro {
	static int[][] map;
	static boolean[][] v;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static boolean flag = false;

	public static void main(String[] args) {
		// 0 : 갈수 있다. 1 : 갈 수 없다.
		// 시작위치 0,0  도착위치는 배열의 오른쪽 가장 아래 
		
		map = new int[][]{  
			{0,0,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,1},
			{1,1,1,0,1,1,1,1},
			{1,1,1,0,1,1,1,1},
			{1,0,0,0,0,0,0,1},
			{1,0,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,0}
		};
		v = new boolean[map.length][map[0].length];
		v[0][0] = true;
		dfs(0, 0);
		
		System.out.println(flag? "성공" : "실패");
	}
	
	static void bfs() {
		// 큐
		// 저장소(구조체, 클래스) => 매 상황마다 바뀌는 값 관
	}
	
	
	
	static void dfs(int x, int y) {
		
		//목적지에 도착하면 멈춤 
		if(x == map[0].length-1 && y == map.length -1) {
			System.out.println("도착");
			flag = true;
			return;
		}
		
		//4방위로 가보기
		
		int nx, ny;
		for(int d=0; d<4; d++) {
			nx = x + dx[d];
			ny = y + dy[d];
			
			// 범위체크
			if(nx < 0 || nx>=map[0].length || ny<0 || ny >=map.length) {
				continue;
			}
			
			// 못가는 곳 체크 
			if(map[ny][nx] == 1) {
				continue;
			}
			
			// 이미 방문 했던곳은 방문할 필요 없음 
			if(v[ny][nx]) {
				continue;
			}
			
			v[ny][nx] = true;
			dfs(nx, ny);
			v[ny][nx] = false;
		}
	}
}