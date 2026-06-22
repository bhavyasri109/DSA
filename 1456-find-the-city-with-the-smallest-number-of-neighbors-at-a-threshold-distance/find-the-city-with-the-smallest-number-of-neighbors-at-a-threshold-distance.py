class Solution:
    def findTheCity(self,n:int,edges:List[List[int]],distanceThreshold:int)->int:
        INF=float('inf')
        dist=[[INF]*n for _ in range(n)]
        for i in range(n):
            dist[i][i]=0
        for u,v,w in edges:
            dist[u][v]=w
            dist[v][u]=w
        for k in range(n):
            for i in range(n):
                for j in range(n):
                    dist[i][j]=min(dist[i][j],dist[i][k]+dist[k][j])
        ans=-1
        minReach=float('inf')
        for i in range(n):
            cnt=0
            for j in range(n):
                if i!=j and dist[i][j]<=distanceThreshold:
                    cnt+=1
            if cnt<=minReach:
                minReach=cnt
                ans=i
        return ans