class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        Map<Integer, List<Integer>> neighbor = new HashMap<>();
        Map<Integer, List<Integer>> dis = new HashMap<>();
        for(int i=0; i<distance.length; i++){
            if(i == 0){
                neighbor.put(i, Arrays.asList(distance.length-1, i+1));
                dis.put(i, Arrays.asList(distance[distance.length-1], distance[i]));
            }else if(i == distance.length - 1){
                neighbor.put(i, Arrays.asList(i-1, 0));
                dis.put(i, Arrays.asList(distance[i-1], distance[i]));
            }else{
                neighbor.put(i, Arrays.asList(i-1, i+1));
                dis.put(i, Arrays.asList(distance[i-1], distance[i]));
            }
        }

        // System.out.println(neighbor);
        // System.out.println(dis);

        int cw = 0;
        int curr = start;
        while(curr != destination){
            cw += dis.get(curr).get(1);
            curr = neighbor.get(curr).get(1);
        }



        int ccw = 0;
        curr = start;
        while(curr != destination){
            ccw += dis.get(curr).get(0);
            curr = neighbor.get(curr).get(0);
        }


        
        return Math.min(cw, ccw);
    }
}
  

