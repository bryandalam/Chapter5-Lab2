

public class Probability implements ProbabilityCalc
{
  private double probability;
  private double favorable;
  private double sampleSpace;
    
    public Probability(int fav, int sam) {
    this.favorable = fav;
    this.sampleSpace = sam;
    this.probability =  favorable / sampleSpace;
  }
  public double otherProbability() {
        return probability;
    }
    public double probabilityAND(Probability p2) {
    return probability * p2.otherProbability();
  }
   public double probabilityOR(Probability p2, double overlap) {
    return (probability + p2.otherProbability()) - overlap;
  }
    
    
}
