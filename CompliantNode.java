import java.util.ArrayList;
import java.util.Set;

/* CompliantNode refers to a node that follows the rules (not malicious)*/
public class CompliantNode implements Node {

    public CompliantNode(double p_graph, double p_malicious, double p_txDistribution, int numRounds) {
        // IMPLEMENT THIS
    }

    public void setFollowees(boolean[] followees) {
        private boolean[] followees;
        public void setFollowees(boolean[]followees) {
            this.followees= followees;
        }
    }

    public void setPendingTransaction(Set<Transaction> pendingTransactions) {
        // IMPLEMENT THIS
    }

    public Set<Transaction> getProposals() {
        // IMPLEMENT THIS
    }

    public void receiveCandidates(ArrayList<Integer[]> candidates) {
        // IMPLEMENT THIS
    }
}
