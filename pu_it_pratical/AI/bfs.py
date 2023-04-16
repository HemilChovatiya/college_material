from collections import defaultdict
class Graph_bfs:
  def __init__(self):
     self.graph_dict = defaultdict(list)
  def edge(self, From, To):
    self.graph_dict[From].append(To)
  def bfs(self, start):
     visited_node = [False] * (len(self.graph_dict))
     queue1 = []
     queue1.append(start)
     visited_node[start] = True
     while queue1:
       start = queue1.pop(0)
       print(start, end=" / ")
       for i in self.graph_dict[start]:
          if visited_node[i] == False:
             queue1.append(i)
             visited_node[i] = True
b1 = Graph_bfs()
print('Enter path from vertex 1 and vertex 2 :- ')
while(1):
  new = int(input('u want to add path? 1(yes)/0(no) :- '))
  k = bool(new)
  if(k == False):
    break
  key = int(input('Enter the vertex 1 :- '))
  value = int(input('Enter the vertex 2 :- '))
  b1.edge(key, value)
n = int(input('Enter number of start vertex :- '))
b1.bfs(n)