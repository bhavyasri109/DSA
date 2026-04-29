class Solution:
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        n=len(graph)
        res=[]
        def dfs(i,temp):
            temp.append(i)
            if i==n-1:
                res.append(temp[:])
                return
            for nei in graph[i]:
                dfs(nei,temp)
                temp.pop()
        dfs(0,[])
        return res
