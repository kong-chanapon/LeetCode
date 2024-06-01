class RecentCounter {
    List<Integer> requests;
    public RecentCounter() {
        this.requests = new ArrayList<>();
    }
    
    public int ping(int t) {
        this.requests.add(t);

        int counter = 0;
        Iterator iterator = this.requests.iterator();
        while(iterator.hasNext()){
            int req = (int)iterator.next();
            if(req >= t - 3000 && req <= t){
                counter++;
            }
        }
        return counter;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */