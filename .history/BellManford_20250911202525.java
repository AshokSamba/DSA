import java.util.ArrayList;

public class BellManford {


    static class Edge{
       int src;
       int dest;
       public Edge(int s,int d){
        this.src=s;
        this.dest=d;
       }
    }


      public  static  void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
             graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(1, 3));
        graph[0].add(new Edge(1, 2));
        graph[0].add(new Edge(1, 3));
        graph[0].add(new Edge(2, 3));
        graph[0].add(new Edge(3, 4));
        graph[0].add(new Edge(3, 5));
        graph[0].add(new Edge(4, 5));
      }
    public static void main(String[] args) {

    //      0---------1       5
     //     |      /   |    / \
    //      |     /    |  /    \
    //      |   /      |/       \
    //       2---------3----------4
    //  
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        for(int i=0;i<V;i++){
        System.out.println(graph);
        }

          
    }

}
