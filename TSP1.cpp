#include<iostream>
#include<limits.h>
#include<cmath>
using namespace std;
 
#define vertex 4
#define Asubset 16			
 
int D[vertex][Asubset];		//Asubset에 속한 도시를 거쳐서 v1에서 v1로 가는 최단경로의 길이
int P[vertex][Asubset];		//최적일주여행길
 
int tsp(int start, int set, int graph[4][4]){		//최단거리 찾는 함수
	int masked, mask, result = -1, temp;
	if (D[start][set] != -1){
		return D[start][set];
	}
	else{
		for (int x = 0; x < vertex; x++){
			mask = Asubset - 1 - (int) pow (2, x);
			masked = set & mask;
	  	if (masked != set){
			temp = graph[start][x] + tsp(x, masked,graph);
			if (result == -1 || result > temp ){
				result =temp;
				P[start][set] = x;
			}
	    }
	}
    }

	D[start][set] = result;
	return result;
}
 
int TSP(int graph[4][4]){			//초기화 시키는 함수
	for (int i = 0; i < vertex; i++){
		for (int j = 0; j < Asubset; j++){
			D[i][j] = -1;
			P[i][j] = -1;
		}
	}
 
	for (int i = 0; i < vertex; i++){
		D[i][0] = graph[i][0];
    }

	return tsp(0, Asubset - 2, graph);
}
 
int main(void){
	int graph[vertex][vertex];
	for(int i=0;i<4;i++)
		for(int j=0;j<4;j++)
			cin>>graph[i][j];				//가중치 받기
	cout << "최솟값: "<<TSP(graph)<<endl;
	
	int a,b,c,tmp,tmp1;
	a = P[0][14];
	tmp = (int)pow(2,a);
	b=P[a][14-tmp];
	tmp1 = (int)pow(2,b);
	c=P[b][14-tmp-tmp1];

	cout<<"경로: "<<"v1 -> v"<<a+1<<" -> v"<<b+1<<" -> v"<<c+1<<" -> v1 "<<endl;	
	
	return 0;
}
