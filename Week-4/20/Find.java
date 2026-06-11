//Find union
class Find{
    int[] parent;
    int[] rank;
    public Find(int n){
        parent = new int[n];
        rank = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
            rank[i] = 1;
        }
    }
    public int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    public void union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);
        if(rootX != rootY){
            if(rank[rootX] > rank[rootY]){
                parent[rootY] = rootX;
            }else if(rank[rootX] < rank[rootY]){
                parent[rootX] = rootY;
            }else{
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
        
    }
    public static void main(String[] args) {
        Find find = new Find(5);
        find.union(0, 1);
        find.union(1, 2);
        find.union(3, 4);
        System.out.println(find.find(0)); // Output: 0
        System.out.println(find.find(1)); // Output: 0
        System.out.println(find.find(2)); // Output: 0
        System.out.println(find.find(3)); // Output: 3
        System.out.println(find.find(4)); // Output: 3
    }
}