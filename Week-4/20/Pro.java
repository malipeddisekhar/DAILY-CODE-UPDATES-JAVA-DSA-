class Pro {

    int[] parent;

    public int find(int x) {
        if (parent[x] == x)
            return x;

        return parent[x] = find(parent[x]); 
    }

    public void union(int a, int b) {

        int pa = find(a);
        int pb = find(b);

        if (pa != pb) {
            parent[pa] = pb;
        }
    }

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int provinces = n;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (isConnected[i][j] == 1) {

                    int pi = find(i);
                    int pj = find(j);

                    if (pi != pj) {
                        union(i, j);
                        provinces--;
                    }
                }
            }
        }

        return provinces;
    }
    public static void main(String[] args) {
        Pro pro = new Pro();
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(pro.findCircleNum(isConnected)); // Output: 2
    }
}