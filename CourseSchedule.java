public class CourseSchedule {
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    
        List<List<Integer>> adjList = new ArrayList<>();
        
        for(int i=0; i < numCourses; i++){
            adjList.add(new ArrayList<Integer>());
        }
        
        for(int[] p:prerequisites){
            adjList.get(p[1]).add(p[0]);
        }
        
        int[] visited = new int[numCourses];
        for(int i=0; i < numCourses; i++){
            if(visited[i] == 0){
                if(cycleExists(adjList, i, visited)){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public boolean cycleExists(List<List<Integer>> adjList, int course, int[] visited){
        visited[course] = 1;
        for(Integer prereq : adjList.get(course)){
            if(visited[prereq] == 1){
                return true;
            }
            
            if(cycleExists(adjList, prereq, visited)){
                return true;
            }
        }
        visited[course] = 2;
        return false;
    }
}