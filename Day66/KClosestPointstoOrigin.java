class Solution {
    class Point implements Comparable<Point>{
        int distsq;
        int idx;

        public Point(int distsq,int idx){
            this.distsq = distsq;
            this.idx = idx;
        }

        public int compareTo(Point p2) {
            return this.distsq - p2.distsq;
        }
    }

    public int[][] kClosest(int[][] pts, int k) {
        int res[][] = new int[k][2];
        
        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int i=0; i<pts.length; i++) {
            int distsq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point(distsq, i));
        }

        for(int i=0; i<k; i++) {
            res[i] = pts[pq.remove().idx];
        }

        return res;
    }
}
