interface RecommendationStrategy{
    void getRecommendation();
}

class RecentlyAdded implements RecommendationStrategy{
    public void getRecommendation(){
        System.out.println("Recently Added movies are added.");
    }
}

class TrendingNow implements RecommendationStrategy{
    public void getRecommendation(){
        System.out.println("Trending Now has been added.");
    }
}

class RecommendationEngine{
    private RecommendationStrategy strategy;

    public RecommendationEngine(RecommendationStrategy strategy){
        this.strategy = strategy;
    }

    public void recommend(){
        strategy.getRecommendation();
    }
}


public class Main{
    public static void main(String args[]){
        RecommendationEngine engine = new RecommendationEngine(new TrendingNow());
        engine.recommend();
    }
}