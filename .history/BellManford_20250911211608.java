import java.util.ArrayList;

public class BellManford {

    static class Edge {
        int src;
        int dest;
         int wt;
        public Edge(int s, int d,int w) {
            this.src = s;
            this.dest = d;
            this.wt  =w;

        }

    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1,-3));
        graph[0].add(new Edge(0, 2,-4));
        graph[1].add(new Edge(1, 3,-1));
        graph[1].add(new Edge(1, 2,-3));
        graph[2].add(new Edge(2, 3,-9));
        graph[3].add(new Edge(3, 4,-6));
        graph[3].add(new Edge(3, 5,-7));
        graph[4].add(new Edge(4, 5,-10));
    }



    public static void bellford(ArrayList<Edge> graph[],int src,int V){

       int[] dist=new int[V];
     ///All Dist values initially infinate exept 1 value
       for(int i=0;i<V;i++){
        if(i!=src){
            dist[i]=Integer.MAX_VALUE;
        }
       }
    //sorce to all node shortest ditance
    for(int k=0;k<V-1;k++){
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                int u=e.src;
                int v=e.dest;
                //Update weights compare all adjacent weights
                if(dist[u]!=Integer.MAX_VALUE&&dist[u]+e.wt<dist[v]){
                       dist[v]=dist[u]+e.wt;
                }
              
            }
        }
    }
  //to print all Answers
   for(int i=0;i<dist.length;i++){
    System.out.print(dist[i]+" ");
   }
System.out.println();

    }

    public static void main(String[] args) {
        int V = 6;
      
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
         bellford(graph, 0, V);
       // for (int i = 0; i < graph.length; i++) {
       //     System.out.print("Vertex " + i + ": ");
       //     for (Edge e : graph[i]) {
       //         System.out.print(e.src +" -> "  + e.dest+", ");
       //     }
       //     System.out.println();
       // }
    }
}
