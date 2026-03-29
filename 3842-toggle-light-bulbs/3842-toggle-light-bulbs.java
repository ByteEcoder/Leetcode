class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {

        List<Integer> l=new ArrayList<>();

        for(int i =0;i<bulbs.size();i++)
            {
                if(!l.isEmpty() && l.contains(bulbs.get(i)))
                {
                    l.remove(bulbs.get(i));
                }

                else
                    l.add(bulbs.get(i));
                
            }

        Collections.sort(l);
        return l;
        
        
    }
}