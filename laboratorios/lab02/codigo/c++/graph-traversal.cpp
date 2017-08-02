#include <iostream>
#include <vector>
#include <list>
#include <stack>
#include <queue>

using namespace std;

/* DFS and BFS algorithms implementation for a graph made with an adjacent list.
 * Replace iostream with stdio.h for its use in competitive programming.
 */

void dfs(vector< list<int> >& graph, int v) {
  bool visited[graph.size()];
  for (int i = 0; i < graph.size(); ++i) {
    visited[i] = 0;
  }

  stack<int> dfs;
  dfs.push(v);

  while (!dfs.empty()) {
    int i = dfs.top();
    dfs.pop();
    if (visited[i]) continue;
    cout << "Visiting node #" << i << endl;
    visited[i] = 1;
    for (list<int>::iterator itr = graph[i].begin(); itr != graph[i].end(); ++itr) {
      dfs.push(*itr);
    }
    
  }
}

void bfs(vector< list<int> >& graph, int v) {
   ....
  
}

int main() {
  int v, e, a, b;
  cout << "V amount: ";
  cin >> v;

  vector< list<int> > graph(v);
  
  cout << "E amount: ";
  cin >> e;

  for (int i = 0; i < e; i++) {
    cout << "Insert edge (a b): ";
    cin >> a >> b;
    graph[a].push_back(b);
    graph[b].push_back(a);
  }

  cout << "DFS traversal from node 0:" << endl;
  dfs(graph, 0);

  cout << "BFS traversal from node 0:" << endl;
  bfs(graph, 0);
  
  return 0;
}
