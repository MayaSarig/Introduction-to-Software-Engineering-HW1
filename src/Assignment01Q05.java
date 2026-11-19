public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int n = m.length, shortest_path_length;
        int[][] dist = new int[n][n];

        for(int u = 0; u < n; u++){
            for(int v = 0; v < n; v++){
                if(u == v){
                    dist[u][u] = 0;
                }
                else if(m[u][v] == 1) {
                    dist[u][v] = 1;
                }
                else{
                    dist[u][v] = n+1;
                }
            }
        }
        
        for(int k = 0; k < n; k++){
            for(int u = 0; u < n; u++){
                for(int v = 0; v < n; v++){
                    if(dist[u][k] != n+1 && dist[k][v] != n+1){
                        dist[u][v] = Math.min(dist[u][v], dist[u][k] + dist[k][v]);
                    }
                }
            }
        }

        if(dist[i][j] == n+1){
            return -1;
        }

        return dist[i][j];
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}