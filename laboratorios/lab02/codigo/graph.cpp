#include <cstdio>
#include <vector>
using namespace std;

const int N = 100;

vector<vector<pair<int, int> > > adjList;
bool was[N];

void addSimpleEdge(int from, int to){
  adjList[from].push_back(make_pair(to, 0));
}
void addWeightedEdge(int from, int to, int w){
  adjList[from].push_back(make_pair(to, w));
}
int getSize(){
  return adjList.size();
}

void dfs(int v){
  was[v] = false;
  printf("Los vertices encontrados al hacer DFS de %d son: ", v);
  for(size_t i = 0; i < adjList[v].size(); ++i){
    int to = adjList[v][i].first;
    if(!was[to]){
      printf(" ,%d", to);
      dfs(to);
    }
  }
}

int main(int argc, char **args){
  int vertices, edges;
  scanf("%d %d", &vertices, &edges);
  adjList.resize(vertices);
  for(int i = 0; i < edges; ++i){
    int a, b, w;
    scanf("%d %d %d", &a, &b, &w);
    addWeightedEdge(a, b, w);
  }
  dfs(1);
}
