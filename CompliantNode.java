import java.util.ArrayList;
import java.util.Set;

/* CompliantNode refers to a node that follows the rules (not malicious)*/
public class CompliantNode implements Node {
    private boolean[] followees;
    private Set<Transaction> pendingTransactions;

    public CompliantNode(double p_graph, double p_malicious, double p_txDistribution, int numRounds) {
        // IMPLEMENT THIS
        // since its a constructor we dont need to implement anything, we can just
        // remove the comment, unless we want to store them up to yall
    }

    public void setFollowees(boolean[] followees) {
        this.followees = followees;
    }

    public void setPendingTransaction(Set<Transaction> pendingTransactions) {
        this.pendingTransactions = pendingTransactions;
    }

    public Set<Transaction> getProposals() {
        return pendingTransactions;
        // IMPLEMENT THIS
    }

    public void receiveCandidates(ArrayList<Integer[]> candidates) {
        // IMPLEMENT THIS
        for (Integer[] candidate : candidates) {

            int txID = candidate[0];
            int senderID = candidate[1];

            if (followees[senderID]) {
                pendingTransactions.add(new Transaction(txID));
            }
        }
    }
}
