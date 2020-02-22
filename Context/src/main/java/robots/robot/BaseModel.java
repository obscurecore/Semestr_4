package robots.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import robots.interfaces.Hand;
import robots.interfaces.Head;
import robots.interfaces.Leg;
import robots.interfaces.Robot;

public abstract class BaseModel implements Robot {

    @Autowired(required = false)
    @Qualifier("sonyHand")
    private Hand hand;

    @Autowired
    @Qualifier("sonyLeg")
    private Leg leg;

    @Autowired
    @Qualifier("sonyGoldenHead")
    private Head head;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor()");
    }

    // public BaseModel(Hand hand, Leg leg, Head head) {
    // this();
    // this.hand = hand;
    // this.leg = leg;
    // this.head = head;
    // }
    //@Required
    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

}
