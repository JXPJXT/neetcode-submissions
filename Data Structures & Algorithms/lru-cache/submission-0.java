class LRUCache {
    Set<Node> cache=new LinkedHashSet<>();
    HashMap<Integer,Node>map=new HashMap<>();
    private int capacity;

    public LRUCache(int capacity) {
     this.capacity=capacity;   
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node=map.get(key);
        cache.remove(node);
        cache.add(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.get(key).value=value;
            get(key);
            return;
        }
        if(cache.size()==capacity){
            Node lastNode=cache.iterator().next();
            cache.remove(lastNode);
            map.remove(lastNode.key);
        }
        Node node=new Node(key,value);
        cache.add(node);
        map.put(key,node);
    }
}
class Node{
    public int key;
    public int value;
    public Node(int key,int value){
        this.key=key;
        this.value=value;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */