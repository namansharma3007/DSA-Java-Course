package TrieDSA;

import java.util.*;

class Node{
	Node links[] = new Node[2];

	public Node(){}

	public void put(int bit, Node node){
		links[bit] = node;
	}

	public boolean containsKey(int bit){
		return links[bit] != null;
	}
    Node get(int bit){
        return links[bit];
    }
}
class Trie{
	private Node root;

	public Trie(){
		root = new Node();
	}

    public void insert(int num){
        Node node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num>>i)&1;
            if(!node.containsKey(bit)){
                node.put(bit, new Node());
            }
            node = node.get(bit);
        }
    }

    public int getMax(int num){
        Node node = root;
        int maxNum = 0;
        for (int i = 31; i >=0; i--) {
            int bit = (num>>i)&1;
            if(node.containsKey(1 - bit)){
                maxNum = maxNum | (1<<i);
                node = node.get(1 - bit);
            } else {
                node = node.get(bit);
            }
        }
        return maxNum;
    }
}

public class Solution {
    public static ArrayList<Integer> maxXorQueries(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> queries) {
        
        Collections.sort(arr);

        ArrayList<ArrayList<Integer>> offlineQueries = new ArrayList<>();

        int index = 0;
        for(ArrayList<Integer> q:queries){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(q.get(1));
            list.add(q.get(0));
            list.add(index++);;
            offlineQueries.add(list);
        }
        
        Collections.sort(offlineQueries, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b){
                return a.get(0).compareTo(b.get(0));
            }
        });

        int ind = 0;
        Trie trie = new Trie();
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < index; i++) {
            ans.add(-1);
        }
        int m = arr.size();
        for(ArrayList<Integer> q:offlineQueries){
            while(ind < m && arr.get(ind) <= q.get(0)){
                trie.insert(arr.get(ind));
                ind++;
            }

            int qIndex = q.get(2);
            if(ind == 0){
                ans.set(qIndex, -1);
            } else {
                ans.set(qIndex, trie.getMax(q.get(1)));
            }
        }
    
        return ans;
    }
}