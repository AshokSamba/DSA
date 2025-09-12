
import java.util.ArrayList;

public class prims{
         public static class Edge{
            int src;
            int dest;
            int wt;
             public Edge(int s,int d,int w){
                 this.src=s;
               this.dest=d;
                 this.wt =w;
             }

      
         }

    public  static void create(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 3, 6));
        graph[1].add(new Edge(1, 2, 2));
        graph[2].add(new Edge(2, 3, 6));
        graph[3].add(new Edge(3, 0, 6));
        graph[4].add(new Edge(4, 5, 8));
        graph[4].add(new Edge(4, 6, 0));
    }

    public static void main(String args[]){
        int V=6;
        ArrayList<Edge>graph[] =new ArrayList[V];
        create(graph);
          for(int i=0;i<graph.length;i++){
           for(Edge e:graph[i]){
            System.out.println(e.src+" "+e.dest+" "+e.wt+" ");
          }
        }
    }
}