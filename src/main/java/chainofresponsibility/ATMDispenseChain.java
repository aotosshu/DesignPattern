package chainofresponsibility;

public class ATMDispenseChain {

    private DispenseChain first;

    public ATMDispenseChain() {

        this.first = new Dollar50Dispenser();
        DispenseChain next1 = new Dollar20Dispenser();
        DispenseChain next2 = new Dollar10Dispenser();

        first.setNextChain(next1);
        next1.setNextChain(next2);
    }

    public DispenseChain getFirst() {
        return first;
    }
}
