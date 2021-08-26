import java.util.LinkedList;
import java.util.Queue;

public class MirroBFS {
	static int[][] map;
	static boolean[][] v;
	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };
//	static boolean flag = false;
	static int min = 999_999_999;
	public static void main(String[] args) {
		// 0 : 갈수 있다. 1 : 갈 수 없다.
		// 시작위치 0,0 도착위치는 배열의 오른쪽 가장 아래

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

//		v = new boolean[map.length][map[0].length];
//		v[0][0] = true;
		bfs();
		System.out.println(min !=0 ? "성공" : "실패");
		
		System.out.println("end");
	}

	static void bfs() {
		// 큐
		// 저장소(구조체, 클래스) => 매 상황마다 바뀌는 값 관리
		Queue<Data> q = new LinkedList<Data>();
		boolean[][] v = new boolean[map.length][map[0].length];
		
		//최초의 할일을 큐에 삽입 
		v[0][0] = true;
		q.offer(new Data(0, 0, 1));  
		
		
		//큐가 빌때까지 반복 
		Data cur;
		while(!q.isEmpty()) {  // 더이상 할일이 없을때까지 무한루프 반복 
			// 할일 얻어오기, 큐에서 만족하는 것 불러오기 
			cur = q.poll();
			
			//최종판단 
			if(cur.x == map[0].length-1 && cur.y == map.length-1) {
				System.out.println("도착 : " + cur.cnt);
//				flag = true;
				min = cur.cnt;
				return;
			}
			//할일 구현(4방위 탐색)
			int nx, ny;
			for(int d=0; d<4; d++) {
				nx = cur.x + dx[d];
				ny = cur.y + dy[d];
				//범위체크
				if(nx < 0 || nx >= map[0].length || ny < 0 || ny >= map.length) {
					continue;
				}
				//방문체크
				if(v[ny][nx]) {
					continue;
				}
				//길막체크
				if(map[ny][nx] == 1) {
					continue;
				}
				
				//큐에삽입
				v[ny][nx] = true;
				q.offer(new Data(nx, ny, cur.cnt + 
						1));
			}
		}
		
	}

	static class Data {
		int x, y;
		int cnt;
		public Data(int x, int y, int cnt) {
			super();
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
		@Override
		public String toString() {
			return "Data [x=" + x + ", y=" + y + ", cnt=" + cnt + "]";
		}
		
		
		
	}
}